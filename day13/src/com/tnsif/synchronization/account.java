package com.tnsif.synchronization;

public class account implements bank{
	
	private int accno;
	private String name;
	private Double balance;
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	
	public account() {
		super();
	}
	
	public account(int accno, String name, Double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public void deposit (int amt) throws depositlimitexceptiondemo {
	if(amt>25000)
		throw new depositlimitexceptiondemo("Daily Limit exceed .....");
	else
	{
		balance+=amt;
		System.out.println("Amount Deposited....."+amt);
	}
	}

	@Override
	public synchronized void  withdraw(int amt) throws insufficientbalanceexception {
		
	if (balance - amt < minbal)
		throw new insufficientbalanceexception();
	else
	{
		balance=balance-amt;
		System.out.println("After withdrawing Rs:"+
		amt +" Current balance is Rs:"+balance);
	}
	}
	
	
	
	

}
