package com.tnsif.association;

public class person {
	
	private String name;
	private address address;
	//we cant achieve multiple inheritance at class level because of ambiguity issue (compiler confuse between multipe parents same method)

	public person(String name, address address) {
		super();
		this.name = name;
		this.address = address;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public address getAddress() {
		return address;
	}



	public void setAddress(address address) {
		this.address = address;
	}
	
	public void displayinfo()
	{
		System.out.println("name :"+name);
		System.out.println("address :"+ address.getStreet() +" ,"+address.getCity() +" ,"+address.getStste() +" ,"+address.getPostalcode());
	}



	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
