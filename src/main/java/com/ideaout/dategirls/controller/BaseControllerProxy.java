package com.ideaout.dategirls.controller;

import com.google.gson.reflect.TypeToken;
import com.ideaout.dategirls.bean.UserInfoMapReslut;
import com.ideaout.dategirls.domain.*;
import com.ideaout.dategirls.http.RequestParmBase;
import com.ideaout.dategirls.http.ResponseDataBase;
import com.ideaout.dategirls.http.config.RequestCode;
import com.ideaout.dategirls.http.requestParm.*;
import com.ideaout.dategirls.service.ActivityService;
import com.ideaout.dategirls.service.DynamicsService;
import com.ideaout.dategirls.service.UserService;
import com.ideaout.dategirls.util.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

class BaseControllerProxy {
    private DynamicsService dynamicsService;
    private UserService userService;
    private ActivityService activityService;

    BaseControllerProxy(DynamicsService dynamicsService, UserService userService,ActivityService activityService) {
        this.dynamicsService = dynamicsService;
        this.userService = userService;
        this.activityService = activityService;
    }

    void post(String requestNo, String requestData, ResponseDataBase responseDataBase, MultipartFile[] file) {
        switch (requestNo){
            case RequestCode.CODE0001:
                handle_CODE0001(requestData,responseDataBase,file);
                break;
            case RequestCode.CODE0002:
                handle_CODE0002(requestData,responseDataBase);
                break;
            case RequestCode.CODE0003:
                handle_CODE0003(requestData,responseDataBase);
                break;
            case RequestCode.CODE0004:
                handle_CODE0004(requestData,responseDataBase);
                break;
            case RequestCode.CODE0005:
                handle_CODE0005(requestData,responseDataBase);
                break;
            case RequestCode.CODE0006:
                handle_CODE0006(requestData,responseDataBase);
                break;
            case RequestCode.CODE0007:
                handle_CODE0007(requestData,responseDataBase);
                break;
            case RequestCode.CODE0008:
                handle_CODE0008(requestData,responseDataBase);
                break;
            case RequestCode.CODE0009:
                handle_CODE0009(requestData,responseDataBase);
                break;
            case RequestCode.CODE0010:
                handle_CODE0010(requestData,responseDataBase);
                break;
            case RequestCode.CODE0011:
                handle_CODE0011(requestData,responseDataBase);
                break;
            case RequestCode.CODE0012:
                handle_CODE0012(requestData,responseDataBase);
                break;
            case RequestCode.CODE0013:
                handle_CODE0013(requestData,responseDataBase,file);
                break;
            case RequestCode.CODE0014:
                handle_CODE0014(requestData,responseDataBase);
                break;
            case RequestCode.CODE0015:
                handle_CODE0015(requestData,responseDataBase);
                break;
            case RequestCode.CODE0016:
                handle_CODE0016(requestData,responseDataBase,file);
                break;
            case RequestCode.CODE0017:
                handle_CODE0017(requestData,responseDataBase);
                break;
            case RequestCode.CODE0018:
                handle_CODE0018(requestData,responseDataBase);
                break;
            case RequestCode.CODE0019:
                handle_CODE0019(requestData,responseDataBase);
                break;
            default:
                responseDataBase.code = HttpUtil.ErrorDec.RequestCodeNoFound.value;
                responseDataBase.errorDec = HttpUtil.ErrorDec.RequestCodeNoFound.desc;
                break;
        }
    }




    //添加动态
    private void handle_CODE0001(String requestData, ResponseDataBase responseDataBase,MultipartFile[] file){
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<Dynamics>>() {
        }.getType());
        if (requestParmBase!=null){
            List<String> imgList = FileUploadUtil.uploadFile(file);
            if (isHasUploadFileFailure(file,imgList.size())){ // 文件上传失败
                responseDataBase.errorDec = "文件上传失败";
                responseDataBase.code = HttpUtil.ErrorDec.RequestError.value;
            }else {
                Dynamics parm = (Dynamics) requestParmBase.requestData;
                parm.setUserid(requestParmBase.userID);
                parm.setImagelist(imgList.toString());
                int i = dynamicsService.addDynamics(parm);
                HttpUtil.setResponseByCRUDReturn(responseDataBase,i);
            }
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //获取用户主页动态列表
    private void handle_CODE0002(String requestData, ResponseDataBase responseDataBase){
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<QueryDynamicListParm>>() {
        }.getType());
        if (requestParmBase!=null){
            QueryDynamicListParm parm = (QueryDynamicListParm) requestParmBase.requestData;
            List<Object> homeDynamicsList = dynamicsService.getHomeDynamicsList(parm.userid, parm.pageSize, parm.pageIndex);
            responseDataBase.code = HttpUtil.ErrorDec.RequestSuccess.value;
            responseDataBase.data = homeDynamicsList;
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //获取朋友圈动态列表
    private void handle_CODE0003(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<QueryDynamicListParm>>() {
        }.getType());
        if (requestParmBase!=null){
            QueryDynamicListParm parm = (QueryDynamicListParm) requestParmBase.requestData;
            parm.userid = requestParmBase.userID;
            List<Object> homeDynamicsList = dynamicsService.getMomentsDynamicsList(parm.userid, parm.pageSize, parm.pageIndex);
            responseDataBase.code = HttpUtil.ErrorDec.RequestSuccess.value;
            responseDataBase.data = homeDynamicsList;
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //动态点赞
    private void handle_CODE0004(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<DynamicLikeParm>>() {
        }.getType());
        if (requestParmBase!=null){
            DynamicLikeParm parm = (DynamicLikeParm) requestParmBase.requestData;
            DynamicsLike dynamicsLike = new DynamicsLike();
            dynamicsLike.setId(TextUtil.getStringID());
            dynamicsLike.setDynamicsid(parm.dynamicsId);
            dynamicsLike.setUserid(requestParmBase.userID);
            dynamicsLike.setTimestamp(requestParmBase.requestTimestamp);
            int i = dynamicsService.likeDynamics(dynamicsLike,parm.isLike);
            HttpUtil.setResponseByCRUDReturn(responseDataBase,i);
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //发表评论
    private void handle_CODE0005(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<Comment>>() {
        }.getType());
        if (requestParmBase!=null){
            Comment comment = (Comment) requestParmBase.requestData;
            comment.setUserid(requestParmBase.userID);
            comment.setTimestamp(requestParmBase.requestTimestamp);
            int i = dynamicsService.addComment(comment);
            HttpUtil.setResponseByCRUDReturn(responseDataBase,i);
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //获取评论列表
    private void handle_CODE0006(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<QueryCommentListParm>>() {
        }.getType());
        if (requestParmBase!=null){
            QueryCommentListParm parm = (QueryCommentListParm) requestParmBase.requestData;
            List<Object> commentList = dynamicsService.getCommentList(parm.dynamicsid,parm.pageSize,parm.pageIndex);
            responseDataBase.code = HttpUtil.ErrorDec.RequestSuccess.value;
            responseDataBase.data = commentList;
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //手机号登录
    private void handle_CODE0007(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<LoginParm>>() {
        }.getType());
        if (requestParmBase!=null){
            LoginParm parm = (LoginParm) requestParmBase.requestData;
            Object user = userService.login(parm);
            handleLoginResult(responseDataBase, user,"登录");
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //第三方登录
    private void handle_CODE0008(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<ThirdLoginParm>>() {
        }.getType());
        if (requestParmBase!=null){
            ThirdLoginParm parm = (ThirdLoginParm) requestParmBase.requestData;
            Object user = userService.thirdLogin(parm);
            handleLoginResult(responseDataBase, user,"登录");
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //注册新用户
    private void handle_CODE0009(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<RegisterParm>>() {
        }.getType());
        if (requestParmBase!=null){
            RegisterParm parm = (RegisterParm) requestParmBase.requestData;
            Object user = userService.register(parm);
            handleLoginResult(responseDataBase, user,"注册");
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //获取其他用户信息
    private void handle_CODE0010(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<UserInfoParm>>() {
        }.getType());
        if (requestParmBase!=null){
            UserInfoParm parm = (UserInfoParm) requestParmBase.requestData;
            UserInfoMapReslut user = userService.getOtherUserInfo(requestParmBase.userID+"",parm.userid);
            responseDataBase.code = HttpUtil.ErrorDec.RequestSuccess.value;
            responseDataBase.data = user;
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //获取当前登录用户信息
    private void handle_CODE0011(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase>() {
        }.getType());
        if (requestParmBase!=null){
            UserInfoMapReslut user = userService.getCurUserInfo(requestParmBase.userID+"");
            responseDataBase.code = HttpUtil.ErrorDec.RequestSuccess.value;
            responseDataBase.data = user;
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //添加关注/取消关注
    private void handle_CODE0012(String requestData, ResponseDataBase responseDataBase) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<FollowParm>>() {
        }.getType());
        if (requestParmBase!=null){
            FollowParm parm = (FollowParm) requestParmBase.requestData;
            int insertId = userService.followHandle(requestParmBase.userID+"",parm.userid,parm.isfollow);
            HttpUtil.setResponseByCRUDReturn(responseDataBase,insertId);
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //修改用户信息
    private void handle_CODE0013(String requestData, ResponseDataBase responseDataBase,MultipartFile[] file) {
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<User>>() {
        }.getType());
        if (requestParmBase!=null){
            List<String> listUrl = FileUploadUtil.uploadFile(file);
            if (isHasUploadFileFailure(file,listUrl.size())){ // 文件上传失败
                responseDataBase.errorDec = "文件上传失败";
                responseDataBase.code = HttpUtil.ErrorDec.RequestError.value;
            }else {
                User parm = (User) requestParmBase.requestData;
                parm.setId(requestParmBase.userID+"");
                if (listUrl.size()>0){
                    parm.setIconurl(listUrl.get(0));
                    responseDataBase.data = listUrl.get(0);
                }
                int insertId = userService.updateUserInfo(parm);
                HttpUtil.setResponseByCRUDReturn(responseDataBase,insertId);
            }
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //发现新好友列表
    private void handle_CODE0014(String requestData, ResponseDataBase responseDataBase){
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<FindLoveParm>>() {
        }.getType());
        if (requestParmBase!=null){
            FindLoveParm findLoveParm = (FindLoveParm) requestParmBase.requestData;
            findLoveParm.userid = requestParmBase.userID+"";
            Object object = userService.getFindLoveList(findLoveParm);
            responseDataBase.data = object;
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //获取关注好友列表
    private void handle_CODE0015(String requestData, ResponseDataBase responseDataBase){
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<QueryMyFollowListParm>>() {
        }.getType());
        if (requestParmBase!=null){
            QueryMyFollowListParm parm = (QueryMyFollowListParm) requestParmBase.requestData;
            parm.userid = requestParmBase.userID+"";
            Object object = userService.getFollowUserList(parm);
            responseDataBase.data = object;
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //上传活动信息
    private void handle_CODE0016(String requestData, ResponseDataBase responseDataBase,MultipartFile[] file){
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<Activity>>() {
        }.getType());
        if (requestParmBase!=null){
            List<String> imgList = FileUploadUtil.uploadFile(file);
            if (isHasUploadFileFailure(file,imgList.size())){ // 文件上传失败
                responseDataBase.errorDec = "文件上传失败";
                responseDataBase.code = HttpUtil.ErrorDec.RequestError.value;
            }else {
                Activity parm = (Activity) requestParmBase.requestData;
                parm.setId(TextUtil.getStringID());
                if (imgList.size()>0){
                    parm.setIconUrl(imgList.get(0));
                }
                Object object = activityService.uploadActivity(parm);
                responseDataBase.data = object;
            }
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //查询活动信息
    private void handle_CODE0017(String requestData, ResponseDataBase responseDataBase){
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase>() {
        }.getType());
        if (requestParmBase!=null){
            Object object = activityService.queryLastActivity();
            responseDataBase.data = object;
        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //上传报名信息
    private void handle_CODE0018(String requestData, ResponseDataBase responseDataBase){
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<QueryMyFollowListParm>>() {
        }.getType());
        if (requestParmBase!=null){

        }
        else {
            setRequestParmError(responseDataBase);
        }
    }

    //查询匹配结果
    private void handle_CODE0019(String requestData, ResponseDataBase responseDataBase){
        RequestParmBase requestParmBase = HttpUtil.getRequestParm(requestData, new TypeToken<RequestParmBase<QueryMyFollowListParm>>() {
        }.getType());
        if (requestParmBase!=null){

        }
        else {
            setRequestParmError(responseDataBase);
        }
    }


    //判断文件是有上传失败  上传失败返回true
    private boolean isHasUploadFileFailure(MultipartFile[] file, int listUrlLength) {
        return file != null && file.length > 0 && listUrlLength==0;
        //return file == null || file.length <= 0 || !TextUtil.isEmpty(returnImageListUrlString);
    }

    //请求参数不合法
    private void setRequestParmError(ResponseDataBase responseDataBase) {
        responseDataBase.code = HttpUtil.ErrorDec.RequestParmError.value;
        responseDataBase.errorDec = HttpUtil.ErrorDec.RequestParmError.desc;
    }

    //登录注册结果统一处理
    private void handleLoginResult(ResponseDataBase responseDataBase, Object user, String requeName) {
        if (user!=null){
            if (user instanceof User){
                responseDataBase.code = HttpUtil.ErrorDec.RequestSuccess.value;
                responseDataBase.data = user;
                responseDataBase.errorDec = requeName+"成功";
            }else {
                responseDataBase.code = HttpUtil.ErrorDec.RequestError.value;
                responseDataBase.errorDec = (String) user;
            }
        }else {
            responseDataBase.code = HttpUtil.ErrorDec.RequestParmError.value;
            responseDataBase.errorDec = requeName+"失败";
        }
    }


}
