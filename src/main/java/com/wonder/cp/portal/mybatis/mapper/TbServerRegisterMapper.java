package com.wonder.cp.portal.mybatis.mapper;

import com.wonder.cp.portal.mybatis.po.TbServerRegister;

public interface TbServerRegisterMapper {
    int deleteByPrimaryKey(String BH);

    int insert(TbServerRegister record);

    int insertSelective(TbServerRegister record);

    TbServerRegister selectByPrimaryKey(String BH);

    int updateByPrimaryKeySelective(TbServerRegister record);

    int updateByPrimaryKey(TbServerRegister record);
}