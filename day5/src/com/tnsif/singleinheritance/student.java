package com.tnsif.singleinheritance;

public class student extends citizen{
	private int rollno;
	private String collegename;
	
	public student() {
		super();
	}

	public student(String name, String adharno, String address, Long phone, int rollno, String collegename) {
		super(name, adharno, address, phone);
		this.rollno = rollno;
		this.collegename = collegename;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}

	

	
	
	
}
