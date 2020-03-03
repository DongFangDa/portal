package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceMedical;
import com.wonder.cp.portal.mybatis.po.TbServiceMedicalKey;

public interface TbServiceMedicalMapper {
    int deleteByPrimaryKey(TbServiceMedicalKey key);

    int insert(TbServiceMedical record);

    int insertSelective(TbServiceMedical record);

    TbServiceMedical selectByPrimaryKey(TbServiceMedicalKey key);

    int updateByPrimaryKeySelective(TbServiceMedical record);

    int updateByPrimaryKey(TbServiceMedical record);
}