package com.tnsif.springbootsample.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer3 {
	private int cid;
	private String cname;
	
	@Autowired
	private Customer1 Customer1;
	@Autowired
	private Customer2 Customer2;
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
		Customer1.show();
		Customer2.show();
		System.out.println("this is from customer3 class");
	}

}
