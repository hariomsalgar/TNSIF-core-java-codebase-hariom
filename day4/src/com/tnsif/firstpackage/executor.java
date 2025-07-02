package com.tnsif.firstpackage;

public class executor {
	public static void main(String[] args) {
		base b1=new base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		//b1.methodPrivate();
		
		b1.varDefault=11;
		b1.methodDefault();
		
		b1.varprotected=100;
		b1.methodProtected();
		
	
		
	}

}
