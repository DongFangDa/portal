package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbMedicalRecordTj;

public interface TbMedicalRecordTjMapper {
    int insert(TbMedicalRecordTj record);

    int insertSelective(TbMedicalRecordTj record);
}