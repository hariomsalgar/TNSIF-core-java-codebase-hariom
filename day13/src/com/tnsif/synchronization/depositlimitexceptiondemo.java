package com.tnsif.synchronization;

public class depositlimitexceptiondemo extends Exception {
	public depositlimitexceptiondemo()
	{
		super("daily limit of deposit is exceed ");
	}
	public depositlimitexceptiondemo(String message)
	{
		super(message);
	}

}
