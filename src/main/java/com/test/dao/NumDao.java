package com.test.dao;

import java.util.List;

import com.test.entity.Num;

public interface NumDao {
	
	public int addNum(Num num);
	
	public List<Num> findAll();
	
	public int deleteAll();

}
