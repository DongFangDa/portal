package com.wonder.cp.portal.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @authorDELL
 * @date2020/3/311:19
 */
public interface TestMapper {

    @Select("select count(1) from tb_dic_hospital")
    int tetsCount1();
}
