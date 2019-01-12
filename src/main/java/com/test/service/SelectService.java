package com.test.service;

import java.util.List;

import com.test.entity.Num;


public interface SelectService {
	
	public List<Num> listAll() throws NumberException;

}
