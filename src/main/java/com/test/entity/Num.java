package com.test.entity;

import java.io.Serializable;


public class Num implements Serializable{
	
	private static final long serialVersionUID = 3138455843831945367L;
	
	private int id;
	private int num;
	private Object result;
	private String date;

	public Num(int num) {
		super();
		this.num = num;
	}
	
	public Num(int num, Object obj) {
		super();
		this.num = num;
		this.result = obj;
	}

	

	@Override
	public String toString() {
		return "Num [id=" + id + ", num=" + num + ", result=" + result + ", date=" + date + "]";
	}

	public int getNum() {
		return num;
	}
	public String getDate() {
		return date;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
