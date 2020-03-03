package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbAcquisitionStandardSta;

public interface TbAcquisitionStandardStaMapper {
    int deleteByPrimaryKey(String BZDM);

    int insert(TbAcquisitionStandardSta record);

    int insertSelective(TbAcquisitionStandardSta record);

    TbAcquisitionStandardSta selectByPrimaryKey(String BZDM);

    int updateByPrimaryKeySelective(TbAcquisitionStandardSta record);

    int updateByPrimaryKey(TbAcquisitionStandardSta record);
}