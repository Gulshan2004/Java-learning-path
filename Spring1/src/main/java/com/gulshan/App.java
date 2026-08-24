package com.gulshan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //This will create the spring container and the configuration for that container is "spring.xml" it will create all the objects mentioned with the bean tag in the spring.xml .
        //Alien obj = new Alien();
        Alien obj1 = (Alien) context.getBean("alien1"); //here we are just calling the object
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
//
//        Alien obj2 = (Alien) context.getBean("alien1"); //here we are just calling the object
//        System.out.println(obj2.age);

//        obj2.code();

//        Desktop obj = (Desktop) context.getBean("com2");
    }
}
