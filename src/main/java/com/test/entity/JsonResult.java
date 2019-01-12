package com.test.entity;

import java.io.Serializable;

public class JsonResult implements Serializable{

	private static final long serialVersionUID = 8939167440685314663L;
	
	private int state;//状态;
	private Object data;//正确返回数据;
	private String message;//报错信息;
	
	
	public JsonResult() {
		super();
	}
	
	public JsonResult(Object data) {
		super();
		state=0;
		this.data = data;
	}
	public JsonResult(Throwable e){
		super();
		state=1;
		data=null;
		message=e.getMessage();
	}
	public JsonResult(int state, Throwable e) {
		super();
		this.state = state;
		data = null;
		message=e.getMessage();
	}

	public JsonResult(int state, Object data, String message) {
		super();
		this.state = state;
		this.data = data;
		this.message = message;
	}
	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", data=" + data + ", message=" + message + "]";
	}
	public int getState() {
		return state;
	}
	public Object getData() {
		return data;
	}
	public String getMessage() {
		return message;
	}
	public void setState(int state) {
		this.state = state;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
