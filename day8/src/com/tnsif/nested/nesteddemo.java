package com.tnsif.nested;

public class nesteddemo implements outerinterface , outerinterface.InnerInterface{

	@Override
	public void calArea() {
		System.out.println("Outer interface ");
		
	}

	@Override
	public void print() {
	System.out.println("inner interface ");
		
	}

}
