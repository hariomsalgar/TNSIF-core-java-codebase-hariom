package com.tnsif.synchronization;

public class accountthread extends Thread{
	
	private account acc;
	private int amt;
	public accountthread(account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}
	
	@Override
	public void run()
	{
		try
		{
			acc.withdraw(amt);
		}
		catch(insufficientbalanceexception e)
		{
			System.err.println(e.getMessage());
		}
	}
}
