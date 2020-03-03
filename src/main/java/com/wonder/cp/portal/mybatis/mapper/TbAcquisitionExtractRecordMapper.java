package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbAcquisitionExtractRecord;
import com.wonder.cp.portal.mybatis.po.TbAcquisitionExtractRecordKey;

public interface TbAcquisitionExtractRecordMapper {
    int deleteByPrimaryKey(TbAcquisitionExtractRecordKey key);

    int insert(TbAcquisitionExtractRecord record);

    int insertSelective(TbAcquisitionExtractRecord record);

    TbAcquisitionExtractRecord selectByPrimaryKey(TbAcquisitionExtractRecordKey key);

    int updateByPrimaryKeySelective(TbAcquisitionExtractRecord record);

    int updateByPrimaryKey(TbAcquisitionExtractRecord record);
}