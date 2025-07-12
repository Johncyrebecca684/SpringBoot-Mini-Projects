package com.tnsif.shoping;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	@Qualifier("clothes")
	private Ordering ordering;
	public void customer() {
		ordering.order();
	}

}
