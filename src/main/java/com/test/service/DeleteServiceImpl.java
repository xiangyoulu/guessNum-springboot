package com.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.NumDao;
import com.test.entity.Num;

@Service("deleteService")
public class DeleteServiceImpl implements DeleteService{

	@Resource
	private NumDao numDao=null;
	
	public void deleteAll() throws NumberException {
		
		numDao.deleteAll();
		List<Num> list= numDao.findAll();
		if(!list.isEmpty()){
			throw new NumberException("记录已清空");
		}
		
	}

}
