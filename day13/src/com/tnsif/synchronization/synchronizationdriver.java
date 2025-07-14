package com.tnsif.synchronization;

public class synchronizationdriver {
	public static void main(String[] args) throws insufficientbalanceexception {
		
		
		account heti= new account (1001, "Heti", 45000);
		
		System.out.println(heti);
		
		accountthread t[]=new accountthread[10];
		for(int i=0;i<10;i++)
		{
			t[i] = new accountthread(heti, 1000 * (i+1));
		}
		try {
			for(int i=0;i<10;i++)
			{
				t[i].join();
			}
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		
		System.out.println("----------------------");
		System.out.println(heti);
		

	}

}
