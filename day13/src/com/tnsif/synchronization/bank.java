package com.tnsif.synchronization;

public interface bank {
	
	static final int minbal=5000;
	static final int daily_limit=25000;
	void deposit (int amt) throws depositlimitexceptiondemo;
	void withdraw (int amt) throws insufficientbalanceexception;
	

}
