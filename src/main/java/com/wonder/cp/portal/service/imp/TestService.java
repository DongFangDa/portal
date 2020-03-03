package com.wonder.cp.portal.service.imp;

import com.wonder.cp.portal.mybatis.mapper.TbDicHospitalMapper;
import com.wonder.cp.portal.mybatis.mapper.TestMapper;
import com.wonder.cp.portal.mybatis.po.TbDicHospital;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @authorDELL
 * @date2020/3/38:55
 */
@Service
public class TestService {

    @Resource()
    TestMapper testMapper;

    @Resource
    TbDicHospitalMapper tbDicHospitalMapper;

    /**
     * test
     * @return
     */
    public int testMethod(){
     return  testMapper.tetsCount1();
    }


    /**
     * test
     * @return
     */
    public List<TbDicHospital> getAllhospital(){
        return  tbDicHospitalMapper.getAllHospitals();
    }

}
