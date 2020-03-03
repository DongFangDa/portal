package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbHisMedicalRecordTj;

public interface TbHisMedicalRecordTjMapper {
    int insert(TbHisMedicalRecordTj record);

    int insertSelective(TbHisMedicalRecordTj record);
}