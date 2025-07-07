package com.tnsif.abstration;

public class rectangular extends shape{
	float width;
	float height;
	
	public rectangular() {
		width =3.2f;
		height=2.0f;
		
	}
//	public rectangular(float width,float height) {
//		
//	}
	public rectangular(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void calculatearea() {
		this.area=width*height;
		
	}
	
	
	

}
