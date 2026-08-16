package com.gulshan.App;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
//        Alien obj = new Alien(); // I dont want to create this object i want spring to create this object
         Alien obj= context.getBean(Alien.class);
         obj.code();

//         Laptop lap = context.getBean(Laptop.class); //we pass the class of which we want to get the object
//         lap.compile();

	}

}

/*Note:-
* In spring Object is called beans.
* Spring Creates Objects inside the container inside JVM and to get access to that container we use Application context
 */