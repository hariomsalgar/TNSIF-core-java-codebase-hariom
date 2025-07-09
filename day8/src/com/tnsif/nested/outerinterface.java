package com.tnsif.nested;

public interface outerinterface {

	void calArea();
	
	interface InnerInterface{
		int id=20;
		void print();
	}
}
