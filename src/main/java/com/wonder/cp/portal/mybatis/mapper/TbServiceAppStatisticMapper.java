package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceAppStatistic;
import java.util.Date;

public interface TbServiceAppStatisticMapper {
    int deleteByPrimaryKey(Date TJ_TIME);

    int insert(TbServiceAppStatistic record);

    int insertSelective(TbServiceAppStatistic record);

    TbServiceAppStatistic selectByPrimaryKey(Date TJ_TIME);

    int updateByPrimaryKeySelective(TbServiceAppStatistic record);

    int updateByPrimaryKey(TbServiceAppStatistic record);
}