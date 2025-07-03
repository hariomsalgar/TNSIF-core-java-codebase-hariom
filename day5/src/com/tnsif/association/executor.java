package com.tnsif.association;

public class executor {
	public static void main(String[] args) {
		address address=new address("405 laxmi nagar","pune","maharashtra","4110001");
		
		
		person p=new person ("hariom", address);
		p.displayinfo();
		System.out.println(p);
	}

}
