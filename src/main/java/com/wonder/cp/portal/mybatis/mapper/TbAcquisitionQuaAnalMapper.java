package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbAcquisitionQuaAnal;
import com.wonder.cp.portal.mybatis.po.TbAcquisitionQuaAnalKey;

public interface TbAcquisitionQuaAnalMapper {
    int deleteByPrimaryKey(TbAcquisitionQuaAnalKey key);

    int insert(TbAcquisitionQuaAnal record);

    int insertSelective(TbAcquisitionQuaAnal record);

    TbAcquisitionQuaAnal selectByPrimaryKey(TbAcquisitionQuaAnalKey key);

    int updateByPrimaryKeySelective(TbAcquisitionQuaAnal record);

    int updateByPrimaryKey(TbAcquisitionQuaAnal record);
}