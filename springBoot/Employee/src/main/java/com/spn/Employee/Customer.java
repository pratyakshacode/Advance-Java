package com.spn.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	@Qualifier("lap1")
	Laptop laptop;
	
	public void details() {
		
		System.out.println("this is the details of Employee");
		laptop.show();
	}
	
	
	
}
