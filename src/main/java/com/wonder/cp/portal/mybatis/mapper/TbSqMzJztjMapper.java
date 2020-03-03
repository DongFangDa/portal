package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbSqMzJztj;
import com.wonder.cp.portal.mybatis.po.TbSqMzJztjKey;

public interface TbSqMzJztjMapper {
    int deleteByPrimaryKey(TbSqMzJztjKey key);

    int insert(TbSqMzJztj record);

    int insertSelective(TbSqMzJztj record);

    TbSqMzJztj selectByPrimaryKey(TbSqMzJztjKey key);

    int updateByPrimaryKeySelective(TbSqMzJztj record);

    int updateByPrimaryKey(TbSqMzJztj record);
}