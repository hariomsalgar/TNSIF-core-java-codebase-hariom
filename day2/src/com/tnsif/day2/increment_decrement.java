package com.tnsif.day2;

public class increment_decrement {

	public static void main(String[] args) {
		/*
		 * pre ++ variable name --> first addition by plus 1 then using the number
		 * post variable name ++ --> first using the number then adding plus 1 if required
		 */
		int a = 10;
		int b= 20;
		++a;
		
		int c = (++a) +(b) +(a--);
		
		System.out.println(c);

	}

}
