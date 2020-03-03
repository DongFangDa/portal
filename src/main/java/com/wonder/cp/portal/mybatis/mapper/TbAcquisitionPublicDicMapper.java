package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbAcquisitionPublicDic;

public interface TbAcquisitionPublicDicMapper {
    int deleteByPrimaryKey(String CZDM);

    int insert(TbAcquisitionPublicDic record);

    int insertSelective(TbAcquisitionPublicDic record);

    TbAcquisitionPublicDic selectByPrimaryKey(String CZDM);

    int updateByPrimaryKeySelective(TbAcquisitionPublicDic record);

    int updateByPrimaryKey(TbAcquisitionPublicDic record);
}