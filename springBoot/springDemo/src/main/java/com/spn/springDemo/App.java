package com.spn.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Hello World!" );

      @SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
     
       Vehicle obj=(Vehicle)context.getBean("car");

    obj.drive();
    	

    }
}