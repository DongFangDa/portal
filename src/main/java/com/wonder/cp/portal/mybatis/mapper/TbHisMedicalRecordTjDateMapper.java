package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbHisMedicalRecordTjDate;
import com.wonder.cp.portal.mybatis.po.TbHisMedicalRecordTjDateKey;

public interface TbHisMedicalRecordTjDateMapper {
    int deleteByPrimaryKey(TbHisMedicalRecordTjDateKey key);

    int insert(TbHisMedicalRecordTjDate record);

    int insertSelective(TbHisMedicalRecordTjDate record);

    TbHisMedicalRecordTjDate selectByPrimaryKey(TbHisMedicalRecordTjDateKey key);

    int updateByPrimaryKeySelective(TbHisMedicalRecordTjDate record);

    int updateByPrimaryKey(TbHisMedicalRecordTjDate record);
}