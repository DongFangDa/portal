package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceFirstStatistic;
import java.util.Date;

public interface TbServiceFirstStatisticMapper {
    int deleteByPrimaryKey(Date TJ_TIME);

    int insert(TbServiceFirstStatistic record);

    int insertSelective(TbServiceFirstStatistic record);

    TbServiceFirstStatistic selectByPrimaryKey(Date TJ_TIME);

    int updateByPrimaryKeySelective(TbServiceFirstStatistic record);

    int updateByPrimaryKey(TbServiceFirstStatistic record);
}