package com.smarthome.device.admin.web.controller;


import com.smarthome.device.admin.dao.entity.po.TestModel;
import com.smarthome.device.admin.dao.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 智能家居小组
 * Date: 2019/10/28 下午 04:09
 */

/*
 * 创建controller类编写方法hello（），
 * 在这里注入了testMapper对象 ，
 * 调用selectAll方法查询所有记录方法返回查询结果
 */
@Controller
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public  @ResponseBody Object hello(){
        List<TestModel> testModels =testMapper.selectAll();
        return testModels;
    }
}