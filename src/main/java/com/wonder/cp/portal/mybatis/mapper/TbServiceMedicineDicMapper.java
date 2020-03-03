package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServiceMedicineDic;

public interface TbServiceMedicineDicMapper {
    int deleteByPrimaryKey(String PRODUCT_ID);

    int insert(TbServiceMedicineDic record);

    int insertSelective(TbServiceMedicineDic record);

    TbServiceMedicineDic selectByPrimaryKey(String PRODUCT_ID);

    int updateByPrimaryKeySelective(TbServiceMedicineDic record);

    int updateByPrimaryKey(TbServiceMedicineDic record);
}