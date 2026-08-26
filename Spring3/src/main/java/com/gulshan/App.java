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

//        Desktop dt = context.getBean(Desktop.class);  // Once Spring creates the Bean,  dt refers to the Desktop object managed by Spring.
        Desktop dt = context.getBean("desktop",Desktop.class);
        dt.compile();
    }
}
