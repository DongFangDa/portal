package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceHealthyStatistic;

public interface TbServiceHealthyStatisticMapper {
    int deleteByPrimaryKey(String INDEXNO);

    int insert(TbServiceHealthyStatistic record);

    int insertSelective(TbServiceHealthyStatistic record);

    TbServiceHealthyStatistic selectByPrimaryKey(String INDEXNO);

    int updateByPrimaryKeySelective(TbServiceHealthyStatistic record);

    int updateByPrimaryKey(TbServiceHealthyStatistic record);
}