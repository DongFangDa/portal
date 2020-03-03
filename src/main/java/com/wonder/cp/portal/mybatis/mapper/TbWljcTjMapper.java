package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbWljcTj;

public interface TbWljcTjMapper {
    int deleteByPrimaryKey(String DATEYM);

    int insert(TbWljcTj record);

    int insertSelective(TbWljcTj record);

    TbWljcTj selectByPrimaryKey(String DATEYM);

    int updateByPrimaryKeySelective(TbWljcTj record);

    int updateByPrimaryKey(TbWljcTj record);
}