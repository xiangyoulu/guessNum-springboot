package com.test.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.NumDao;
import com.test.entity.JsonResult;
import com.test.entity.Num;

@Service("numService")
public class NumServiceImpl implements NumService{

	@Resource
	private NumDao numDao= null;
	
	public JsonResult guessAction(String num, String num2) throws NumberException {
		boolean b= true;
		for(int i=0;i<num2.length();i++){
			if(!Character.isDigit(num2.charAt(i))){
				b=false;
				throw new NumberException("请输入正确数字");
			}
		}
		if(b){
			if(num2.trim().isEmpty()){
				throw new NumberException("输入值不能为空");
			}else{
				int num3= Integer.parseInt(num);
				int num4= Integer.parseInt(num2);
				if(num4>num3){
					String str="大了";
					Num n= new Num(num4,str);
					numDao.addNum(n);
					return new JsonResult(str);
				}else if(num4<num3){
					String str="小了";
					Num n= new Num(num4,str);
					numDao.addNum(n);
					return new JsonResult(str);
				}else if(num4==num3){
					String str="恭喜你,回答正确!";
					Num n= new Num(num4,str);
					numDao.addNum(n);
					return new JsonResult(str);
				}else{
					throw new NumberException("其他错误");
				}		
				
			}
		}else{
			throw new NumberException("请输入正确数字");
		}
	}

}
