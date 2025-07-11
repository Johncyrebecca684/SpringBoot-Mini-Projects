package com.tnsif.springbootsample.dependencyinjection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Customer1 {
	private int cid;
	private String cname;
	
	public Customer1() {
		System.out.println("Customer1 has bean called");
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	void show() {
		System.out.println("this is from customer1 class");
	}

}
