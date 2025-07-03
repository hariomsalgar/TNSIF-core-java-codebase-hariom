package com.tnsif.oop;

public class encapsulation {
	
	private int serailnum;
	private String name;
	private int age;
	
	
	//getter and setter
	public int getSerailnum() {
		return serailnum;
	}
	public void setSerailnum(int serailnum) {
		this.serailnum = serailnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "encapsulation [serailnum=" + serailnum + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
