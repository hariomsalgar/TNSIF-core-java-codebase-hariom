package com.tnsif.overloading;

public class overloadingdemo {
	
	public static void main(String[] args) {
		point p=new point();
		System.out.println(p);
		
		
		
		point p1= new point(20.9f,3.14f);
		System.out.println(p1);
		
		System.out.println("----method overloading----");
		System.out.println(methodoverloading.addition(3.14f, 23.11f));
		System.out.println(methodoverloading.addition(1, 2, 3));
	}

}
