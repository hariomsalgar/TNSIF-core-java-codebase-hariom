package com.tnsif.abstration;

public class square extends shape{
	float side;
	
	
	public square() {
		side=3.14f;
		
	}
//	public square(float side) {
//		
//	}
	public square(float side) {
		//super();
		this.side=side;
	}
	@Override
	public void calculatearea() {
		this.area=side*side;
		
	}

}
