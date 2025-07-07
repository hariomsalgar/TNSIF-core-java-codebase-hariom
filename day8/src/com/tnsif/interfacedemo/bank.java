package com.tnsif.interfacedemo;

public interface bank {
	
	final static float minbal=5000;
	final static float deposit_limit=25000;
	
	public void deposit(float amount);
	public void withdraw(float amount);
	
}
