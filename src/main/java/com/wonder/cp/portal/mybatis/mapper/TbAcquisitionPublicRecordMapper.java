package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbAcquisitionPublicRecord;

public interface TbAcquisitionPublicRecordMapper {
    int deleteByPrimaryKey(String BM);

    int insert(TbAcquisitionPublicRecord record);

    int insertSelective(TbAcquisitionPublicRecord record);

    TbAcquisitionPublicRecord selectByPrimaryKey(String BM);

    int updateByPrimaryKeySelective(TbAcquisitionPublicRecord record);

    int updateByPrimaryKey(TbAcquisitionPublicRecord record);
}