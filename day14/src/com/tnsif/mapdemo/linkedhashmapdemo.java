package com.tnsif.mapdemo;

import java.util.LinkedHashMap;

public class linkedhashmapdemo {
	public static void main(String[] args) {
		
		LinkedHashMap ht=new LinkedHashMap();
		ht.put(101, 100);
		ht.put(1012, 23.34);
		ht.put(203, "mumbai");
		ht.put(401, 10);
		ht.put(101, 300);
		ht.put(102, 300);
		
		
		System.out.println(ht);
		
		
	}

}
