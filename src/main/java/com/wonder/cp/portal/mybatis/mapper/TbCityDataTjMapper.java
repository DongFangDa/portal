package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbCityDataTj;

public interface TbCityDataTjMapper {
    int deleteByPrimaryKey(String DATEYM);

    int insert(TbCityDataTj record);

    int insertSelective(TbCityDataTj record);

    TbCityDataTj selectByPrimaryKey(String DATEYM);

    int updateByPrimaryKeySelective(TbCityDataTj record);

    int updateByPrimaryKey(TbCityDataTj record);
}