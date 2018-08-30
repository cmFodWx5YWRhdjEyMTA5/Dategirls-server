package com.ideaout.dategirls.dao;

import com.ideaout.dategirls.bean.UserInfoMapReslut;
import com.ideaout.dategirls.domain.User;
import com.ideaout.dategirls.domain.UserExample;
import java.util.List;

import com.ideaout.dategirls.http.requestParm.FindLoveParm;
import com.ideaout.dategirls.http.requestParm.QueryMyFollowListParm;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    UserInfoMapReslut selectByPrimaryKey(Long id);

    UserInfoMapReslut selectOtherByPrimaryKey(@Param("myId") Long myId, @Param("otherId") Long otherId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    int updateByPartField(User record);

    List<UserInfoMapReslut> selectFindLoveListByExample(@Param("parm") FindLoveParm findLoveParm);

    List<UserInfoMapReslut> selectFollowListById(@Param("parm") QueryMyFollowListParm parm);

}