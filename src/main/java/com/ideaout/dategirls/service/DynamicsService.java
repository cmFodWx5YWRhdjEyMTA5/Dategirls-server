package com.ideaout.dategirls.service;

import com.ideaout.dategirls.dao.DynamicsMapper;
import com.ideaout.dategirls.domain.Comment;
import com.ideaout.dategirls.domain.Dynamics;
import com.ideaout.dategirls.domain.DynamicsLike;
import com.ideaout.dategirls.http.requestParm.DynamicLikeParm;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface DynamicsService {
    int addDynamics(Dynamics dynamics);  //添加动态
    int addComment(Comment comment);  //添加评论
    List<Object> getMomentsDynamicsList(long userId,int pageSize,int pageIndex);  //获取朋友圈动态列表
    List<Object> getHomeDynamicsList(long userId,int pageSize,int pageIndex);  //获取个人主页动态列表
    List<Object> getCommentList(long dynamicsId, int pageSize, int pageIndex);  //获取评论列表
    int likeDynamics(DynamicsLike dynamicsLike,int isLikeType);  //点赞动态


}
