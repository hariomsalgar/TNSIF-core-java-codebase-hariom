package com.tnsif.overriding;


class color{
	protected color getcolor()
	{
		color s=new color();
		return s;
		
	}
}

class red extends color{
	@Override
	protected red getcolor()
	{
		red s =new red();
		return s;
		
	}
}

class blue extends color{
	@Override
	protected blue getcolor()
	{
		blue s =new blue();
		return s;
		
	}
}


public class covarientoverriding {
	public static void main(String[] args) {
		
	}
	

}
