package com.ideaout.dategirls.serviceImpl;

import com.ideaout.dategirls.dao.CommentMapper;
import com.ideaout.dategirls.dao.DynamicsLikeMapper;
import com.ideaout.dategirls.dao.DynamicsMapper;
import com.ideaout.dategirls.dao.UserMapper;
import com.ideaout.dategirls.domain.*;
import com.ideaout.dategirls.http.requestParm.DynamicLikeParm;
import com.ideaout.dategirls.service.DynamicsService;
import com.ideaout.dategirls.util.TextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DynamicsServiceImpl implements DynamicsService {

    @Autowired
    DynamicsMapper dynamicsMapper;
    @Autowired
    DynamicsLikeMapper dynamicsLikeMapper;
    @Autowired
    CommentMapper commentMapper;


    @Override
    public int addDynamics(Dynamics dynamics) {
        if (dynamics!=null && dynamics.getUserid()>0 && !TextUtil.isEmpty(dynamics.getContent())) {
            return dynamicsMapper.insert(dynamics);
        }
        return -1;
    }

    @Override
    public int addComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public List<Object> getHomeDynamicsList(long userId, int pageSize, int pageIndex) {
        DynamicsExample dynamicsExample = new DynamicsExample();
        if (userId>0){
            dynamicsExample.createCriteria().andUseridEqualTo(userId);
            dynamicsExample.setOrderByClause("timestamp desc");  //某个字段 降序排序
            dynamicsExample.setStart(pageIndex*(pageSize-1));
            dynamicsExample.setLimit(pageSize);
            return dynamicsMapper.selectHomeByExample(dynamicsExample);
        }
        else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<Object> getMomentsDynamicsList(long userId, int pageSize, int pageIndex) {
        DynamicsExample dynamicsExample = new DynamicsExample();
        dynamicsExample.setOrderByClause("timestamp desc");  //某个字段 降序排序
        dynamicsExample.setStart(pageIndex*(pageSize-1));
        dynamicsExample.setLimit(pageSize);
        return dynamicsMapper.selectMomentsByExample(dynamicsExample);
    }


    @Override
    public int likeDynamics(DynamicsLike dynamicsLike,int isLikeType) {   //isLikeType=1为点赞，=0为取消(删除)
        if (isLikeType==1){
            return dynamicsLikeMapper.insert(dynamicsLike);
        }
        else {
            DynamicsLikeExample dynamicsLikeExample = new DynamicsLikeExample();
            DynamicsLikeExample.Criteria criteria = dynamicsLikeExample.createCriteria();
            criteria.andDynamicsidEqualTo(dynamicsLike.getDynamicsid());
            criteria.andUseridEqualTo(dynamicsLike.getUserid());
            return dynamicsLikeMapper.deleteByExample(dynamicsLikeExample);
        }
    }

    @Override
    public List<Object> getCommentList(long dynamicsId, int pageSize, int pageIndex) {
        if (dynamicsId>0){
            CommentExample commentExample = new CommentExample();
            commentExample.createCriteria().andDynamicsidEqualTo(dynamicsId);
            commentExample.setOrderByClause("timestamp desc");  //某个字段 降序排序
            commentExample.setStart(pageIndex*(pageSize-1));
            commentExample.setLimit(pageSize);
            return commentMapper.selectByExample(commentExample);
        }else {
            return new ArrayList<>();
        }
    }

}
