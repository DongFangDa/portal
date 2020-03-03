package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbPopulationTj;
import java.math.BigDecimal;

public interface TbPopulationTjMapper {
    int deleteByPrimaryKey(BigDecimal INDEXNO);

    int insert(TbPopulationTj record);

    int insertSelective(TbPopulationTj record);

    TbPopulationTj selectByPrimaryKey(BigDecimal INDEXNO);

    int updateByPrimaryKeySelective(TbPopulationTj record);

    int updateByPrimaryKey(TbPopulationTj record);
}