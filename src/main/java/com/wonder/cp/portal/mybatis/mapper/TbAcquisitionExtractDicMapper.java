package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbAcquisitionExtractDic;

public interface TbAcquisitionExtractDicMapper {
    int deleteByPrimaryKey(String TABLECODE);

    int insert(TbAcquisitionExtractDic record);

    int insertSelective(TbAcquisitionExtractDic record);

    TbAcquisitionExtractDic selectByPrimaryKey(String TABLECODE);

    int updateByPrimaryKeySelective(TbAcquisitionExtractDic record);

    int updateByPrimaryKey(TbAcquisitionExtractDic record);
}