package com.spn.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Annotation!" );
        
        @SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        
        
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
