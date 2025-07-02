package com.tnsif.constructor;

public class customer {
	private String customername;
	private int customerid;
	private String customercity;
	
	//default constructor
	public customer()
	{
		System.out.println("this is default constructor   ");
	}
	
	//para constructor
	public customer (String customername,int customerid, String customercity) {
		//this(); //calling default constructor
		
		System.out.println("this is para constructor ");
		this.customername=customername;
		this.customerid=customerid;
		this.customercity=customercity;
		
	}
	
	
	//rightclick --->source --->generate getter and setter --->select all --->generate

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	
	
    // right click ---> source ---> generate tostring --->generate
	@Override
	public String toString() {
		return "customer [customername=" + customername + ", customerid=" + customerid + ", customercity="
				+ customercity + "]";
	}
}
