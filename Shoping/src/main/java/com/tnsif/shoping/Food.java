package com.tnsif.shoping;

import org.springframework.stereotype.Component;

@Component

public class Food implements Ordering {
	public void order() {
		System.out.println("Im ordering clothes...");
	}

}
