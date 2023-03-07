package com.spn.Employee;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Annotation!" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Customer customer = (Customer) context.getBean(Customer.class);
        customer.details();
        
        	
    }
}
