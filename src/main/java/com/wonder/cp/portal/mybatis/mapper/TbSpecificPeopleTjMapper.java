package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbSpecificPeopleTj;
import java.util.Date;

public interface TbSpecificPeopleTjMapper {
    int deleteByPrimaryKey(Date YEAR);

    int insert(TbSpecificPeopleTj record);

    int insertSelective(TbSpecificPeopleTj record);

    TbSpecificPeopleTj selectByPrimaryKey(Date YEAR);

    int updateByPrimaryKeySelective(TbSpecificPeopleTj record);

    int updateByPrimaryKey(TbSpecificPeopleTj record);
}