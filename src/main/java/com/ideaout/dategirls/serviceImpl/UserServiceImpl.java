package com.ideaout.dategirls.serviceImpl;

import com.ideaout.dategirls.bean.UserInfoMapReslut;
import com.ideaout.dategirls.dao.FollowMapper;
import com.ideaout.dategirls.dao.UserMapper;
import com.ideaout.dategirls.domain.*;
import com.ideaout.dategirls.http.RequestParmBase;
import com.ideaout.dategirls.http.requestParm.*;
import com.ideaout.dategirls.service.UserService;
import com.ideaout.dategirls.util.TextUtil;
import com.ideaout.dategirls.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    FollowMapper followMapper;

    @Override
    public Object login(LoginParm parm) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPhoneEqualTo(parm.phone);
        if (!TextUtil.isEmpty(parm.password)){
            criteria.andPasswordEqualTo(parm.password);
            List<User> users = userMapper.selectByExample(userExample);
            if (users.size()==0){
                return "用户名或密码不正确";
            }else {
                return users.get(0);
            }
        }else {
           //短信登录，验证短信验证码
            List<User> users = userMapper.selectByExample(userExample);
            if (users.size()==0){
                //不存在用户，注册新用户
                User user = new User();
                user.setPhone(parm.phone);
                int insert = userMapper.insert(user);
                if (insert>0){
                    return userMapper.selectByExample(userExample).get(0);
                }
            }else {
                return users.get(0);
            }
        }
        return null;
    }

    @Override
    public Object register(RegisterParm registerParm) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPhoneEqualTo(registerParm.phone);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size()==0){
            //不存在用户，注册新用户
            User user = new User();
            user.setPhone(registerParm.phone);
            user.setPassword(registerParm.password);
            int insert = userMapper.insert(user);
            if (insert>0){
                return userMapper.selectByExample(userExample).get(0);
            }
        }else {
            //已经注册过
            return "该手机号已经注册过";
        }
        return null;
    }

    @Override
    public Object thirdLogin(ThirdLoginParm thirdLoginParm) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();

        User tempUser = new User();
        UserUtil.ThirdLoginWay loginTypeByCode = UserUtil.ThirdLoginWay.getLoginTypeByCode(thirdLoginParm.loginWayType);
        switch (loginTypeByCode){
            case WeiXin:
                criteria.andWeixinidEqualTo(thirdLoginParm.id);
                tempUser.setWeixinid(thirdLoginParm.id);
                break;
            case qq:
                criteria.andQqidEqualTo(thirdLoginParm.id);
                tempUser.setQqid(thirdLoginParm.id);
                break;
        }

        if (loginTypeByCode!=UserUtil.ThirdLoginWay.NotSupport){
            List<User> users = userMapper.selectByExample(userExample);
            if (users.size()==0){
                //不存在用户，注册新用户
                tempUser.setNickname(thirdLoginParm.nickname);
                tempUser.setIconurl(thirdLoginParm.iconurl);
                int insert = userMapper.insert(tempUser);
                if (insert>0){
                    return userMapper.selectByExample(userExample).get(0);
                }
            }
            else {
                return users.get(0);
            }
        }
        return null;
    }

    @Override
    public UserInfoMapReslut getCurUserInfo(String userid) {
        return userMapper.selectByPrimaryKey(Long.parseLong(userid));
    }

    @Override
    public UserInfoMapReslut getOtherUserInfo(String myUserid, String otherUserid) {
        return userMapper.selectOtherByPrimaryKey(Long.parseLong(myUserid),Long.parseLong(otherUserid));
    }

    @Override
    public int followHandle(String myUserid,String otherUserid,int isFollow) {
        if (isFollow==1){
            Follow follow = new Follow();
            follow.setId(TextUtil.getLongID());
            follow.setFollowUserid(Long.parseLong(myUserid));
            follow.setFollowedUserid(Long.parseLong(otherUserid));
            return followMapper.insert(follow);
        }else {
            FollowExample followExample = new FollowExample();
            FollowExample.Criteria criteria = followExample.createCriteria();
            criteria.andFollowUseridEqualTo(Long.parseLong(myUserid));
            criteria.andFollowedUseridEqualTo(Long.parseLong(otherUserid));
            return followMapper.deleteByExample(followExample);
        }

    }

    @Override
    public int updateUserInfo(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(Long.parseLong(user.getId()));
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    public Object getFindLoveList(FindLoveParm findLoveParm) {
        return userMapper.selectFindLoveListByExample(findLoveParm);
    }

    @Override
    public Object getFollowUserList(QueryMyFollowListParm parm) {
        return userMapper.selectFollowListById(parm);
    }

}
