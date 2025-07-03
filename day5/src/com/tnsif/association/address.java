package com.tnsif.association;

public class address {
	private String street;
	private String city;
	private String stste;
	private String postalcode;
	
	
	public address() {
		super();
	}


	public address(String street, String city, String stste, String postalcode) {
		super();
		this.street = street;
		this.city = city;
		this.stste = stste;
		this.postalcode = postalcode;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStste() {
		return stste;
	}


	public void setStste(String stste) {
		this.stste = stste;
	}


	public String getPostalcode() {
		return postalcode;
	}


	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
	
	

}
