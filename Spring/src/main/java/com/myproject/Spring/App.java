package com.spn.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Hello World!" );
//    	Car car=new Car();
//    	car.drive();
//    	Bike obj=new Bike(); //dependency on right and left, use di
//    	 create interface
//      Vehicle obj=new Bike();//now change right part only
//       y right part , so use spring di
//       obj.drive();
//       getBean can be get through BeanFactory or ApplicationContext
//       small app use beanfactoruy and web app app context
       
      @SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
     
     // Vehicle obj=(Vehicle)context.getBean("vehicle");
       Vehicle obj=(Vehicle)context.getBean("car");
//       Vehicle obj=(Vehicle)context.getBean("bike");
       //d capitalized, Car object c small
    obj.drive();
    	
       //for tyre
//       Tyre t=(Tyre)context.getBean("tyre");
//       System.out.println( t);
    }
}