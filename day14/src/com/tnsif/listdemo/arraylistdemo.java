package com.tnsif.listdemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arraylistdemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		System.out.println(list.isEmpty());
		list.add(10);
		list.add(20);
		list.add("hariom");
		list.add("vijay");
		list.add(false);
		list.add(true);
		list.add(3.14f);
		list.add(20);
		list.add(10);
		
		System.out.println("List is "+list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.contains(10));
		System.out.println(list.contains(1));
		list.remove(false);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.remove(list.lastIndexOf(20)));
		System.out.println(list);
		System.out.println(list.indexOf(20));
		list.clear();
		System.out.println(list);
		System.out.println("---------------||----------------");
		
		//generics
		List<String>names=new ArrayList<String>();
		
		names.add("spidey");
		names.add("iron-man");
		names.add("thor");
		names.add("black-widow");
		names.add("hawkeye");
		names.add("thor");
		
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		System.out.println(names.contains("nick fury"));
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		//traversing the list
		
		Iterator<String> i=names.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm+" ");
		}
		
		
		System.out.println();
		System.out.println(names);
		
		ListIterator<String> li=names.listIterator(names.size());
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
		}
			
		
	}

}
