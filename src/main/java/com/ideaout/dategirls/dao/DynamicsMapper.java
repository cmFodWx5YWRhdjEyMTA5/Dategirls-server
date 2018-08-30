package com.ideaout.dategirls.dao;

import com.ideaout.dategirls.domain.Dynamics;
import com.ideaout.dategirls.domain.DynamicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicsMapper {
    int countByExample(DynamicsExample example);

    int deleteByExample(DynamicsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Dynamics record);

    int insertSelective(Dynamics record);

    List<Object> selectHomeByExample(DynamicsExample example);
    List<Object> selectMomentsByExample(DynamicsExample example);

    Dynamics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Dynamics record, @Param("example") DynamicsExample example);

    int updateByExample(@Param("record") Dynamics record, @Param("example") DynamicsExample example);

    int updateByPrimaryKeySelective(Dynamics record);

    int updateByPrimaryKey(Dynamics record);
}