package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StudentDao;
import com.test.entity.Student;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
    private StudentDao studentDao;

	@Override
	public List<Student> getStudent() {
		List<Student> list = new ArrayList<Student>();
        return studentDao.getStudent();
	}

}
