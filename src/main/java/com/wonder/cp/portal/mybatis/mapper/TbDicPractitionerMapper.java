package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbDicPractitioner;
import com.wonder.cp.portal.mybatis.po.TbDicPractitionerKey;

public interface TbDicPractitionerMapper {
    int deleteByPrimaryKey(TbDicPractitionerKey key);

    int insert(TbDicPractitioner record);

    int insertSelective(TbDicPractitioner record);

    TbDicPractitioner selectByPrimaryKey(TbDicPractitionerKey key);

    int updateByPrimaryKeySelective(TbDicPractitioner record);

    int updateByPrimaryKey(TbDicPractitioner record);
}