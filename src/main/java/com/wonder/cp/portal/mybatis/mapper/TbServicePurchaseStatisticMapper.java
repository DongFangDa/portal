package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServicePurchaseStatistic;

public interface TbServicePurchaseStatisticMapper {
    int deleteByPrimaryKey(String ORDERID);

    int insert(TbServicePurchaseStatistic record);

    int insertSelective(TbServicePurchaseStatistic record);

    TbServicePurchaseStatistic selectByPrimaryKey(String ORDERID);

    int updateByPrimaryKeySelective(TbServicePurchaseStatistic record);

    int updateByPrimaryKey(TbServicePurchaseStatistic record);
}