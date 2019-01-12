package com.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.NumDao;
import com.test.entity.Num;

@Service("selectService")
public class SelectServiceImpl implements SelectService{

	@Resource
	private NumDao numDao;

	public List<Num> listAll() throws NumberException {
		List<Num> list= 
				numDao.findAll();
		if(list==null || list.isEmpty()){
			throw new NumberException("查询记录为空");
		}else{
			return list;
		}
	}	
	

}
