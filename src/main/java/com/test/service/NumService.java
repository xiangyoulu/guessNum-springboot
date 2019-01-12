package com.test.service;

import com.test.entity.JsonResult;

public interface NumService {
	
	public JsonResult guessAction(String num,String num2) throws NumberException;
	

}
