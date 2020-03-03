package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceTcmStatistic;
import com.wonder.cp.portal.mybatis.po.TbServiceTcmStatisticKey;

public interface TbServiceTcmStatisticMapper {
    int deleteByPrimaryKey(TbServiceTcmStatisticKey key);

    int insert(TbServiceTcmStatistic record);

    int insertSelective(TbServiceTcmStatistic record);

    TbServiceTcmStatistic selectByPrimaryKey(TbServiceTcmStatisticKey key);

    int updateByPrimaryKeySelective(TbServiceTcmStatistic record);

    int updateByPrimaryKey(TbServiceTcmStatistic record);
}