package com.klu.springdemo;

public class Address {
	
	String hname;
	int rno;
	public Address(String hname, int rno) {
		super();
		this.hname = hname;
		this.rno = rno;
	}
	public Address() 
	{
		
	}
	@Override
	public String toString() {
		return "Address [hname=" + hname + ", rno=" + rno + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
