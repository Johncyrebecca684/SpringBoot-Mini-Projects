package com.tnsif.springbootsample.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var =SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Customer1 C1= var.getBean(Customer1.class);
		C1.show();
		
		Customer2 C2= var.getBean(Customer2.class);
		C2.show();
		
		Customer3 C3= var.getBean(Customer3.class);
		C3.show();
		
	}

}
