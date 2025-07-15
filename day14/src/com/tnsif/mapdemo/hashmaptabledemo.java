package com.tnsif.mapdemo;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class hashmaptabledemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
		ht.put(101, "pune");
		ht.put(102, "mumbai");
		ht.put(103, "newyark");
		ht.put(101, "aurangabad");
		ht.put(104, "nagar");
		
		System.out.println(ht);
		
		
		ht.putIfAbsent(105, "pcmc");
		ht.put(101,"baramati");
		
		System.out.println(ht);
		
//		ht.put(106, null);
//		System.out.println(ht);
//		
//		ht.put(null, "null");
//		System.out.println(ht);
//		
		
		System.out.println(ht.get(103));
		System.out.println(ht.replace(104, "latur"));
		System.out.println(ht);
		
		
		ht.clone();
		System.out.println(ht);
		
		Set s=ht.keySet();
		System.out.println(s);
		Collection<String> c=ht.values();
		System.out.println(c);
	}
}	