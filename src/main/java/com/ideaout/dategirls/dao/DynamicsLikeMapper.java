package com.ideaout.dategirls.dao;

import com.ideaout.dategirls.domain.DynamicsLike;
import com.ideaout.dategirls.domain.DynamicsLikeExample;
import com.ideaout.dategirls.domain.DynamicsLikeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicsLikeMapper {
    int countByExample(DynamicsLikeExample example);

    int deleteByExample(DynamicsLikeExample example);

    int deleteByPrimaryKey(DynamicsLikeKey key);

    int insert(DynamicsLike record);

    int insertSelective(DynamicsLike record);

    List<DynamicsLike> selectByExample(DynamicsLikeExample example);

    DynamicsLike selectByPrimaryKey(DynamicsLikeKey key);

    int updateByExampleSelective(@Param("record") DynamicsLike record, @Param("example") DynamicsLikeExample example);

    int updateByExample(@Param("record") DynamicsLike record, @Param("example") DynamicsLikeExample example);

    int updateByPrimaryKeySelective(DynamicsLike record);

    int updateByPrimaryKey(DynamicsLike record);
}