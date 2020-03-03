package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbFourCentersTj;
import com.wonder.cp.portal.mybatis.po.TbFourCentersTjKey;

public interface TbFourCentersTjMapper {
    int deleteByPrimaryKey(TbFourCentersTjKey key);

    int insert(TbFourCentersTj record);

    int insertSelective(TbFourCentersTj record);

    TbFourCentersTj selectByPrimaryKey(TbFourCentersTjKey key);

    int updateByPrimaryKeySelective(TbFourCentersTj record);

    int updateByPrimaryKey(TbFourCentersTj record);
}