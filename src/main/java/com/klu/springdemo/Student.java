package com.klu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student implements StuInt{
	int id;
	String name;
	@Autowired
	@Qualifier("a1")
	Address add1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd1() {
		return add1;
	}
	public void setAdd1(Address add1) {
		this.add1 = add1;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add1=" + add1+ "]";
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	


