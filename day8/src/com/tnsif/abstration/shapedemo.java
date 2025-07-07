package com.tnsif.abstration;

public class shapedemo {
	public static void main(String[] args) {
		shape s;
		s =new square();
		s.calculatearea();
		s.show();
		
		s =new rectangular();
		s.calculatearea();
		s.show();
		
		s =new square(3.14f);
		s.calculatearea();
		s.show();
		
		s =new rectangular(11,12);
		s.calculatearea();
		s.show();
	}

}
