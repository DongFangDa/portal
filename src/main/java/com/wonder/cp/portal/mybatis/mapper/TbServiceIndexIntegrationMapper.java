package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceIndexIntegration;

public interface TbServiceIndexIntegrationMapper {
    int deleteByPrimaryKey(String XH);

    int insert(TbServiceIndexIntegration record);

    int insertSelective(TbServiceIndexIntegration record);

    TbServiceIndexIntegration selectByPrimaryKey(String XH);

    int updateByPrimaryKeySelective(TbServiceIndexIntegration record);

    int updateByPrimaryKey(TbServiceIndexIntegration record);
}