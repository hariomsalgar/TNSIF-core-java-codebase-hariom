package com.tnsif.listdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlistdemo {
	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(40);
		li.add(50);
		System.out.println(li);
		li.add(5);
		System.out.println(li);
		li.add(2,60);
		System.out.println(li);
		
		li.add(20);
		System.out.println(li);
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
		
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
		
		
		ListIterator<Integer> ll=li.listIterator();
		while(ll.hasNext())
		{
			System.out.println(ll.next()+"\t");
		}
		
		System.out.println();
		
		ll=li.listIterator(li.size());
		while(ll.hasPrevious())
		{
			int n=ll.previous();
			System.out.println(n+"\t");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
