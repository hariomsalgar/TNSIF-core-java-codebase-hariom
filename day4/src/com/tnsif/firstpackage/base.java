package com.tnsif.firstpackage;

public class base {
	
	int varDefault =10;
	public int varPublic=20;
	public int varPrivate=30;
	public int varprotected=40;
	
	void methodDefault()
	{
		System.out.println("default access base class ");
		System.out.println("default variable : "+varDefault);
	}
	public void methodPublic()
	{
		System.out.println("default access base class ");
		System.out.println("public variable : "+varPublic);
	}
	private void methodPrivate()
	{
		System.out.println("default access base class ");
		System.out.println("private variable : "+varPrivate);
	}
	protected void methodProtected()
	{
		System.out.println("default access base class ");
		System.out.println("protected variable : "+varProtected);
	}

}
