package com.ideaout.dategirls.controller;

import com.google.gson.reflect.TypeToken;
import com.ideaout.dategirls.http.RequestParmBase;
import com.ideaout.dategirls.http.ResponseDataBase;
import com.ideaout.dategirls.service.ActivityService;
import com.ideaout.dategirls.service.DynamicsService;
import com.ideaout.dategirls.service.UserService;
import com.ideaout.dategirls.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BaseController {
    @Autowired
    DynamicsService dynamicsService;
    @Autowired
    UserService userService;
    @Autowired
    ActivityService activityService;

    @RequestMapping("/req")
    @CrossOrigin //使用注解方式添加跨域访问消息头
    private String post(HttpServletRequest request, @RequestParam(value="file",required=false)MultipartFile[] fileList) {
        String requestData = HttpUtil.resolveRequestData(request, fileList == null);
        LogUtil.i("request: " + requestData);
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase>() {
        }.getType());
        ResponseDataBase responseDataBase = HttpUtil.getResponseDataBase(requestParmBase);

        if (responseDataBase.code == HttpUtil.ErrorDec.RequestSuccess.value) {
            BaseControllerProxy baseController = new BaseControllerProxy(dynamicsService,userService,activityService);
            baseController.post(requestParmBase.requestNo,requestData,responseDataBase, fileList);
        }

        String result = GsonUtil.toJson(responseDataBase);
        LogUtil.i("response: "+ result);
        return result;
    }



}
