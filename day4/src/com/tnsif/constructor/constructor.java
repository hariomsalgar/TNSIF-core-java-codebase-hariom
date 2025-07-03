package com.tnsif.constructor;
import java.util.Scanner;

public class constructor {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String name, city;
		int id;
		System.out.println("enter customer id");
		id=s.nextInt();
		
		s.nextLine();
		System.out.println("enter customer name");
		name=s.nextLine();
		
		System.out.println("enter customer city");
		city=s.nextLine();
		
		System.out.println(" ");
		
		customer c1=new customer();  // default 
		c1.setCustomercity(city);
		c1.setCustomerid(id);
		c1.setCustomername(name);
		System.out.println(c1);
		
		System.out.println("enter customer id");
		id=s.nextInt();
		
		s.nextLine();
		System.out.println("enter customer name");
		name=s.nextLine();
		
		System.out.println("enter customer city");
		city=s.nextLine();
		
		System.out.println(" ");
		
		customer c2=new customer(name, id, city);
		System.out.println(c2);
		
		System.out.println(c2.getCustomercity());
		System.out.println(c2.getCustomerid());
		System.out.println(c2.getCustomername());
		
		
		
	}

}
