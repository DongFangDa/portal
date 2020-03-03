package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceHomeStatistic;
import com.wonder.cp.portal.mybatis.po.TbServiceHomeStatisticKey;

public interface TbServiceHomeStatisticMapper {
    int deleteByPrimaryKey(TbServiceHomeStatisticKey key);

    int insert(TbServiceHomeStatistic record);

    int insertSelective(TbServiceHomeStatistic record);

    TbServiceHomeStatistic selectByPrimaryKey(TbServiceHomeStatisticKey key);

    int updateByPrimaryKeySelective(TbServiceHomeStatistic record);

    int updateByPrimaryKey(TbServiceHomeStatistic record);
}