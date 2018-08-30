package com.ideaout.dategirls.util;



import com.ideaout.dategirls.http.RequestParmBase;
import com.ideaout.dategirls.http.ResponseDataBase;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URLDecoder;

public class HttpUtil {

    public enum ErrorDec{
        RequestSuccess(200,"请求成功"),RequestWayNotSupport(1,"请求方式或参数格式不对"),RequestCodeNoFound(2,"请求码不正确"),
        RequestParmError(3,"请求参数不正确"),RequestDataBaseError(4,"数据库操作异常"),RequestError(5,"请求失败");

        public int value;
        public String desc;
        ErrorDec(int value, String desc) {
            this.value = value;
            this.desc = desc;
        }
    }

    public static RequestParmBase getRequestParm(HttpServletRequest request, Type typeOfT ) {
        String requestPostStr = getRequestData(request);
        LogUtil.i("requestData  :" + requestPostStr);
        if (!TextUtil.isEmpty(requestPostStr)) {
           return GsonUtil.fromJson(requestPostStr, typeOfT);
        }
        return null;
    }

    public static RequestParmBase getRequestParm(String requestData, Type typeOfT ) {
        if (!TextUtil.isEmpty(requestData)) {
            return GsonUtil.fromJson(requestData, typeOfT);
        }
        return null;
    }

    //感觉请求数据判断请求是否合法
    public static ResponseDataBase getResponseDataBase(RequestParmBase requestParmBase){
        ResponseDataBase responseDataBase = new ResponseDataBase();
        if (requestParmBase ==null){
            responseDataBase.code = ErrorDec.RequestWayNotSupport.value;
            responseDataBase.errorDec= ErrorDec.RequestWayNotSupport.desc;
        }else {
            responseDataBase.code = ErrorDec.RequestSuccess.value;
            responseDataBase.errorDec = ErrorDec.RequestSuccess.desc;
        }
        return responseDataBase;
    }

    //获取HTTP请求的json数据
    private static String getRequestData(HttpServletRequest request) {
        BufferedReader br;
        StringBuilder sb = null;
        String reqBody = null;
        try {
            br = new BufferedReader(new InputStreamReader(
                    request.getInputStream()));
            String line = null;
            sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            reqBody = URLDecoder.decode(sb.toString(), "UTF-8");
            if (reqBody.length()>0){
                reqBody = reqBody.substring(reqBody.indexOf("{"));
                request.setAttribute("inputParam", reqBody);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return reqBody;
    }


    //解析请求数据，根据是否是json格式，做不同处理
    public static String resolveRequestData(HttpServletRequest request,boolean isJsonFromatData) {
        String requestData ;
        if (isJsonFromatData){
            requestData = HttpUtil.getRequestData(request);
        }
        else {
            requestData = request.getParameter("requestData");  //相当于form表单提交，取出key对应的的值即可
        }
        return requestData;
    }

    //根据数据库操作的返回结果设置返回结果：insert>0表示成功
    public static void setResponseByCRUDReturn(ResponseDataBase responseDataBase, int insert) {
        if (insert>0){
            responseDataBase.code = HttpUtil.ErrorDec.RequestSuccess.value;
            responseDataBase.errorDec = HttpUtil.ErrorDec.RequestSuccess.desc;
        }
        else {
            responseDataBase.code = HttpUtil.ErrorDec.RequestDataBaseError.value;
            responseDataBase.errorDec = HttpUtil.ErrorDec.RequestDataBaseError.desc;
        }
    }
}
