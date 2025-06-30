package com.tnsif.day2;

public class nestedifelse {

	public static void main(String[] args) {
		
		int a=25,b=200,c=50;
		if (a>b)
			if (a>c)
				System.out.println(a+" is greater number ");
			else
				System.out.println(c+" is greater number");
		else
			System.out.println(b+" is greater number");
	}

}
