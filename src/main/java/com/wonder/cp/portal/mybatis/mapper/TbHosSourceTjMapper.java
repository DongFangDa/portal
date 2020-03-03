package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbHosSourceTj;
import com.wonder.cp.portal.mybatis.po.TbHosSourceTjKey;

public interface TbHosSourceTjMapper {
    int deleteByPrimaryKey(TbHosSourceTjKey key);

    int insert(TbHosSourceTj record);

    int insertSelective(TbHosSourceTj record);

    TbHosSourceTj selectByPrimaryKey(TbHosSourceTjKey key);

    int updateByPrimaryKeySelective(TbHosSourceTj record);

    int updateByPrimaryKey(TbHosSourceTj record);
}