package com.tnsif.jumpstatements;

public class continue_statements {
	public static void main(String[] args) {
		for (int k=5; k<=15; k++)
		{
			//odd numbers are skipped
			
			if (k%2 !=0)
				continue;
			System.out.println(k+" ");
		}
	}

}
