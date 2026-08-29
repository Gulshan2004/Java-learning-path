package com.gulshan;

import com.gulshan.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop dt = context.getBean(Desktop.class);  // Once Spring creates the Bean,  dt refers to the Desktop object managed by Spring.
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt.compile();
    }
}
