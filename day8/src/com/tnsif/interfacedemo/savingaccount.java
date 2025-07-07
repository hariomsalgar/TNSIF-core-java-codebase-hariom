package com.tnsif.interfacedemo;

public class savingaccount extends customer implements bank{
	private int accno;
	private float balance;
	
	
	public savingaccount(String name, String city, int accno, float balance) {
		super(name, city);
		this.accno = accno;
		this.balance = balance;
	}


	public int getAccno() {
		return accno;
	}


	public void setAccno(int accno) {
		this.accno = accno;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public void deposit(float amount) {
		if(amount <0|| amount > deposit_limit)
		{
			System.out.println("please deposit valid amount ");
		}
		else
		{
			balance+=amount;
			System.out.println("Rs : "+amount +" is deposited successfully ");
		}
	}
	@Override
	public void withdraw(float amount) {
		if(amount <=balance-minbal)
		{
			balance-=amount;
			System.out.println("Rs : "+amount +"  withdrawl  successfully  ");
		}
		else
		{
			System.out.println("insufficient balance ");
		}
		
	}


	@Override
	public String toString() {
		return "savingaccount [accno=" + accno + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	

}
