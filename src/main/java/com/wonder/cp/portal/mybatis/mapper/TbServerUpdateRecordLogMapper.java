package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServerUpdateRecordLog;
import com.wonder.cp.portal.mybatis.po.TbServerUpdateRecordLogKey;

public interface TbServerUpdateRecordLogMapper {
    int deleteByPrimaryKey(TbServerUpdateRecordLogKey key);

    int insert(TbServerUpdateRecordLog record);

    int insertSelective(TbServerUpdateRecordLog record);

    TbServerUpdateRecordLog selectByPrimaryKey(TbServerUpdateRecordLogKey key);

    int updateByPrimaryKeySelective(TbServerUpdateRecordLog record);

    int updateByPrimaryKey(TbServerUpdateRecordLog record);
}