package com.wonder.cp.portal.controller;


import com.wonder.cp.portal.mybatis.po.TbDicHospital;
import com.wonder.cp.portal.service.imp.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author DELL
 * @date 2019/10/1915:45
 */
@Controller
public class TestControler {
    @Autowired
    TestService testService;

    /**
     * 测试前端界面是否正常
     *
     * @return 测试
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String getTest() {
        return "demo";
    }


    /**
     * 测试数据库否正常
     * @return 测试
     */

   @RequestMapping(value = "/test1",method = RequestMethod.GET)
   @ResponseBody
    public int gettestdb(){

        return  testService.testMethod();
    }

    /**
     * 测试数据库封装
     * @return 测试
     */
    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    @ResponseBody
    public List<TbDicHospital> getAllHospital(){
        return  testService.getAllhospital();
    }


}

