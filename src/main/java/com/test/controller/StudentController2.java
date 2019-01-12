package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Student;
import com.test.service.StudentService;

/**
 * 集成Mybatis访问数据库
 * @author admin
 *
 */

@RestController
@RequestMapping("/mydb2")
public class StudentController2 {
	
	@Autowired
    private StudentService service;

    @RequestMapping("/getStudent")
    public List<Student> getThreeForMessage(){
        List<Student> list = service.getStudent();        
        return list;
    }

}
