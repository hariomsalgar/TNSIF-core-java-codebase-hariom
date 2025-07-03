package com.tnsif.hierarchicalinheritance;

public class hierarchicaldriver {
	public static void main(String[] args) {
		person p1=new person();
		System.out.println("----- person details -----");
		System.out.println(p1);
		
		System.out.println("--------------------------");
		person p;
		
		p=new person("hariom","pune");
		System.out.println("person details "+p);
		
		p=new student("rishi","nashik","SY",80.89f);
		System.out.println("student details "+p);
		
		p=new employee("isha","nagar",1002,450000,"developments");
		System.out.println("employee details "+p);
		
	}

}
