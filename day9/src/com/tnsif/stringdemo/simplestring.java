package com.tnsif.stringdemo;

public class simplestring {
	public static void main(String[] args) {
		
		char c[]= {'i','n','d','i','a'};
		
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(s1);
		System.out.println(s2);
		
		//concatenation to prevent long lines
		String longstr="this is to show "+" how long sentences"+"\t"+" can be printed";
		System.out.println(longstr);
		
	}
	

}
