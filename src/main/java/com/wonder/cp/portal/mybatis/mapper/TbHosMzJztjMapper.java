package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbHosMzJztj;
import com.wonder.cp.portal.mybatis.po.TbHosMzJztjKey;

public interface TbHosMzJztjMapper {
    int deleteByPrimaryKey(TbHosMzJztjKey key);

    int insert(TbHosMzJztj record);

    int insertSelective(TbHosMzJztj record);

    TbHosMzJztj selectByPrimaryKey(TbHosMzJztjKey key);

    int updateByPrimaryKeySelective(TbHosMzJztj record);

    int updateByPrimaryKey(TbHosMzJztj record);
}