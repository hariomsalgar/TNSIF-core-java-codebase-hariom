package com.tnsif.singleinheritance;

public class citizen {
	private String name;
	private String adharno;
	private String address;
	private Long phone;
	
	
	public citizen()
	{
		System.out.println("citizen object created ");
	}


	public citizen(String name, String adharno, String address, Long phone) {
		//super();
		this.name = name;
		this.adharno = adharno;
		this.address = address;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdharno() {
		return adharno;
	}


	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "citizen [name=" + name + ", adharno=" + adharno + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	

}
