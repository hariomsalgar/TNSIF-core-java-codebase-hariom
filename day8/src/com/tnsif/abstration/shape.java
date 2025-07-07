package com.tnsif.abstration;

public abstract class shape {
	
	protected float area;
	
	public abstract void calculatearea();
	
	//solid method
	public void show()
	{
		System.out.println("area of shape is "+area);
		
	}

}
