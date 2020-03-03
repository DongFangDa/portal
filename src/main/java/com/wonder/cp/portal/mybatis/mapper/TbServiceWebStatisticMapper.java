package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceWebStatistic;
import java.util.Date;

public interface TbServiceWebStatisticMapper {
    int deleteByPrimaryKey(Date TJ_TIME);

    int insert(TbServiceWebStatistic record);

    int insertSelective(TbServiceWebStatistic record);

    TbServiceWebStatistic selectByPrimaryKey(Date TJ_TIME);

    int updateByPrimaryKeySelective(TbServiceWebStatistic record);

    int updateByPrimaryKey(TbServiceWebStatistic record);
}