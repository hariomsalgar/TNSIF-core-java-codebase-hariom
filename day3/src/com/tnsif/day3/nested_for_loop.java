package com.tnsif.day3;

public class nested_for_loop {

	public static void main(String[] args) {
		
		
		
		//firstly iterate through inner loop and when inner condition gets False 
		//then iterate through outer loop and then inner loop fro that iteration
		int beg=5;
		int end=20;
		for (int i=beg;i<=end;i++) //outer loop
		{
			for (int j = 1; j<=10; j++) //inner loop
			{
				System.out.println(i+"*"+ j+ "="+i*j);
			}
			System.out.println();
		}
		

	}

}
