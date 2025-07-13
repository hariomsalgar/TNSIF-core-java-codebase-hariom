package com.tnsif.runnable;

public class runnabledemo {
	public static void main(String[] args) {
		Runnable r= new usingrunnable(10, 1, "hi");
		Thread t1=new Thread(r);
		t1.start();
		
		
		
	}

}
