package com.tnsif.multythreading;

public class childdemo {
	public static void main(String[] args) {
		
		childthread c=new childthread(10, "Hello");
		childthread c1=new childthread(5, "TNSIF");
		
		c.start();
		c1.start();
		System.out.println("End of the Program");

	}

}
