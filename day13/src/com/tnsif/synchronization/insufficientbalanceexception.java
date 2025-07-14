package com.tnsif.synchronization;

public class insufficientbalanceexception extends Exception{
	public insufficientbalanceexception()
	{
		super ( "insufficient balance in your account");
	}
	
	public insufficientbalanceexception(String message)
	{
		super (message);
	}
}
