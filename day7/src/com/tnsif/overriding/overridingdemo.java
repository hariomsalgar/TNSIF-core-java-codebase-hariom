package com.tnsif.overriding;

public class overridingdemo {
	public static void main(String[] args) {
		rbi rbi;
		rbi =new sbi();
		System.out.println(rbi.getrateofinterest());
		
		
		rbi=new icici();
		System.out.println(rbi.getrateofinterest());
		
		rbi=new hdfc();
		System.out.println(rbi.getrateofinterest());
	}

}
