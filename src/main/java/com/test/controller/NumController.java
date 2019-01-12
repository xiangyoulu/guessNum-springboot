package com.test.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.entity.JsonResult;
import com.test.entity.Num;
import com.test.service.DeleteService;
import com.test.service.NumService;
import com.test.service.NumberException;
import com.test.service.SelectService;



@RestController
//@RequestMapping("/num")
public class NumController {
	@Resource
	private NumService numService;
	@Resource
	private SelectService selectService;
	@Resource
	private DeleteService deleteService;
	
	
	
	//3.清空记录;
	@RequestMapping("/delete.do")
//	@ResponseBody
	public Object deleteRes(){
		try{
			deleteService.deleteAll();
			return new JsonResult("锟斤拷占锟铰硷拷晒锟�");
		}catch(Exception e){
			return new JsonResult(e);
		}
	}
	
	//2.查询记录;
	@RequestMapping("/list.do")
//	@ResponseBody
	public JsonResult listRes(){
		try{
			List<Num> list= selectService.listAll();
			return new JsonResult(list);
		}catch(Exception e){
			e.printStackTrace();
			return new JsonResult(2,e);
		}
	}
	
	//1.猜数字;
	@RequestMapping("/guess.do")
//	@ResponseBody
	public JsonResult guess(String num,String num2){
		try{
			JsonResult jr= 
					numService.guessAction(num, num2);
			//System.out.println(jr);
			return jr;
		}catch(NumberException e){
			e.printStackTrace();
			return new JsonResult(2,e);
		}catch(Exception e){
			e.printStackTrace();
			return new JsonResult(3,e);
		}
	}
	
}
