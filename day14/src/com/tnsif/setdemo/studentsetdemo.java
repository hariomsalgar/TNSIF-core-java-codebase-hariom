package com.tnsif.setdemo;
import java.util.HashSet;
import java.util.Set;

public class studentsetdemo {
	public static void main(String[] args) {

		Set<student> set=new HashSet<student>();
		set.add(new student(101, "hariom", 45.09));
		set.add(new student(1012, "vijay", 67.89));
		set.add(new student(101, "rishi", 78.89));
		set.add(new student(1012, "vijay", 67.89));//duplicate
		set.add(new student(1012, "vijay", 90.87));
		
		System.out.print(set);
	}
}
