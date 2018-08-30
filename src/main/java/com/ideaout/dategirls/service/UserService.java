package com.ideaout.dategirls.service;

import com.ideaout.dategirls.bean.UserInfoMapReslut;
import com.ideaout.dategirls.domain.User;
import com.ideaout.dategirls.http.RequestParmBase;
import com.ideaout.dategirls.http.requestParm.*;

public interface UserService {
    Object login(LoginParm loginParm);
    Object register(RegisterParm registerParm);
    Object thirdLogin(ThirdLoginParm thirdLoginParm);
    UserInfoMapReslut getCurUserInfo(String userid);
    UserInfoMapReslut getOtherUserInfo(String myUserid, String otherUserid);
    int followHandle(String myUserid,String otherUserid,int isFollow);
    int updateUserInfo(User user);

    Object getFindLoveList(FindLoveParm findLoveParm);
    Object getFollowUserList(QueryMyFollowListParm parm);

}
