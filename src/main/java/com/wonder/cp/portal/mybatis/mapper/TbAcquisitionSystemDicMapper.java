package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbAcquisitionSystemDic;

public interface TbAcquisitionSystemDicMapper {
    int deleteByPrimaryKey(String XTBM);

    int insert(TbAcquisitionSystemDic record);

    int insertSelective(TbAcquisitionSystemDic record);

    TbAcquisitionSystemDic selectByPrimaryKey(String XTBM);

    int updateByPrimaryKeySelective(TbAcquisitionSystemDic record);

    int updateByPrimaryKey(TbAcquisitionSystemDic record);
}