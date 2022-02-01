package com.cjx.test;

import com.cjx.mapper.StudentMapper;
import com.cjx.pojo.Student;
import com.cjx.service.StudentService;
import com.cjx.service.serviceImpl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
//指定使用的运行器
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件的位置，如果在resources中可直接根据如下方式编写
@ContextConfiguration(locations = {"classpath:application.xml"})
public class TestCRUD {
    @Resource
    StudentService service;
    @Test
    public void test(){
        System.out.println(service);
        Student student = service.selectOne(1);
        System.out.println(student);
    }
}
