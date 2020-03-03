package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbDicHospital;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbDicHospitalMapper {
    int deleteByPrimaryKey(String YLJGBM);

    int insert(TbDicHospital record);

    int insertSelective(TbDicHospital record);

    TbDicHospital selectByPrimaryKey(String YLJGBM);

    int updateByPrimaryKeySelective(TbDicHospital record);

    int updateByPrimaryKey(TbDicHospital record);

    @Select("select * from tb_dic_hospital")
    List<TbDicHospital> getAllHospitals();
}