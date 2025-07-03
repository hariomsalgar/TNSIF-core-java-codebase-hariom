package com.tnsif.hierarchicalinheritance;

public class student extends person{
	private String clas;
	private Float percent;
	
	public student() {
		System.out.println("student class default constructor ");
		clas="TE";
		percent= 80f;
		
	}

	public student(String name, String city, String clas, Float percent) {
		super(name, city);
		this.clas = clas;
		this.percent = percent;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public Float getPercent() {
		return percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "student [clas=" + clas + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}

	
	
}
