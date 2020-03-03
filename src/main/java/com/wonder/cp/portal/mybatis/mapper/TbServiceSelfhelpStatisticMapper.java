package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceSelfhelpStatistic;
import com.wonder.cp.portal.mybatis.po.TbServiceSelfhelpStatisticKey;

public interface TbServiceSelfhelpStatisticMapper {
    int deleteByPrimaryKey(TbServiceSelfhelpStatisticKey key);

    int insert(TbServiceSelfhelpStatistic record);

    int insertSelective(TbServiceSelfhelpStatistic record);

    TbServiceSelfhelpStatistic selectByPrimaryKey(TbServiceSelfhelpStatisticKey key);

    int updateByPrimaryKeySelective(TbServiceSelfhelpStatistic record);

    int updateByPrimaryKey(TbServiceSelfhelpStatistic record);
}