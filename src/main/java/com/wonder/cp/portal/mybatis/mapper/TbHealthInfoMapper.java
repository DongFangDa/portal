package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbHealthInfo;
import java.math.BigDecimal;

public interface TbHealthInfoMapper {
    int deleteByPrimaryKey(BigDecimal INDEXNO);

    int insert(TbHealthInfo record);

    int insertSelective(TbHealthInfo record);

    TbHealthInfo selectByPrimaryKey(BigDecimal INDEXNO);

    int updateByPrimaryKeySelective(TbHealthInfo record);

    int updateByPrimaryKey(TbHealthInfo record);
}