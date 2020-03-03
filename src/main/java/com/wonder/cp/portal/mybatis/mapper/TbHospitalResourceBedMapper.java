package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbHospitalResourceBed;
import com.wonder.cp.portal.mybatis.po.TbHospitalResourceBedKey;

public interface TbHospitalResourceBedMapper {
    int deleteByPrimaryKey(TbHospitalResourceBedKey key);

    int insert(TbHospitalResourceBed record);

    int insertSelective(TbHospitalResourceBed record);

    TbHospitalResourceBed selectByPrimaryKey(TbHospitalResourceBedKey key);

    int updateByPrimaryKeySelective(TbHospitalResourceBed record);

    int updateByPrimaryKey(TbHospitalResourceBed record);
}