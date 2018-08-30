package com.ideaout.dategirls.dao;

import com.ideaout.dategirls.domain.PairApply;
import com.ideaout.dategirls.domain.PairApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PairApplyMapper {
    int countByExample(PairApplyExample example);

    int deleteByExample(PairApplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(PairApply record);

    int insertSelective(PairApply record);

    List<PairApply> selectByExample(PairApplyExample example);

    PairApply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PairApply record, @Param("example") PairApplyExample example);

    int updateByExample(@Param("record") PairApply record, @Param("example") PairApplyExample example);

    int updateByPrimaryKeySelective(PairApply record);

    int updateByPrimaryKey(PairApply record);
}