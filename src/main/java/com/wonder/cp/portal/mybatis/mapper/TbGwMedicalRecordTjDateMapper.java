package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbGwMedicalRecordTjDate;
import com.wonder.cp.portal.mybatis.po.TbGwMedicalRecordTjDateKey;

public interface TbGwMedicalRecordTjDateMapper {
    int deleteByPrimaryKey(TbGwMedicalRecordTjDateKey key);

    int insert(TbGwMedicalRecordTjDate record);

    int insertSelective(TbGwMedicalRecordTjDate record);

    TbGwMedicalRecordTjDate selectByPrimaryKey(TbGwMedicalRecordTjDateKey key);

    int updateByPrimaryKeySelective(TbGwMedicalRecordTjDate record);

    int updateByPrimaryKey(TbGwMedicalRecordTjDate record);
}