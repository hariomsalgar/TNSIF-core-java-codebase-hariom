package com.tnsif.multilevelinheritance;
//multilevel inheritance

public class country {
	
	private String countryname;
	private String capital;
	
	
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "country [countryname=" + countryname + ", capital=" + capital + "]";
	}
	

}
