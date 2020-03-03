package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServicePublic;
import com.wonder.cp.portal.mybatis.po.TbServicePublicKey;

public interface TbServicePublicMapper {
    int deleteByPrimaryKey(TbServicePublicKey key);

    int insert(TbServicePublic record);

    int insertSelective(TbServicePublic record);

    TbServicePublic selectByPrimaryKey(TbServicePublicKey key);

    int updateByPrimaryKeySelective(TbServicePublic record);

    int updateByPrimaryKey(TbServicePublic record);
}