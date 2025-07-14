package com.tnsif.listdemo;
import java.util.ArrayDeque;
import java.util.Deque;

public class exdequedemo {
	public static void main(String[] args) {
		Deque<String> deque1= new ArrayDeque<String>();
		deque1.add("clint");
		deque1.add("thor");
		deque1.add("thanos");
		deque1.add("tony");
		deque1.add("peeter");
		
		System.out.println(deque1);
		deque1.peekFirst();
		System.out.println(deque1);
		
		for(String str: deque1)
		{
			System.out.println("queue is "+str);
			
		}
		System.out.println(deque1);
		
	}

}
