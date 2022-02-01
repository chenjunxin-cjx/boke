package com.cjx.service.serviceImpl;

import com.cjx.mapper.StudentMapper;
import com.cjx.pojo.Student;
import com.cjx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Override
    public Student selectOne(Integer id) {
        Student student = studentMapper.selectOne(id);
        return student;
    }
}
