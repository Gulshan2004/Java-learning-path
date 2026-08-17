package com.gulshan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //This will create the spring container and the configuration for that container is "spring.xml" it will create all the objects mentioned with the bea tag in the spring.xml .
        //Alien obj = new Alien();
        Alien obj1 = (Alien) context.getBean("alien1"); //here we are just calling the object
        obj1.code(); //and working with the object in the container

        Alien obj2 = (Alien) context.getBean("alien1"); //here we are just calling the object
        obj2.code();
    }
}
/*
* NOTE:-
* the more the no. of bean created in the Spring.xml for the same class the more object will be crated for that class */