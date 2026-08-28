package com.gulshan.App;

import com.gulshan.App.model.Alien;
import com.gulshan.App.model.Laptop;
import com.gulshan.App.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
//        Alien obj = new Alien(); // I dont want to create this object i want spring to create this object

		Laptop lap = context.getBean(Laptop.class);
		LaptopService service= context.getBean(LaptopService.class);

		service.addLaptop(lap);



//		Alien obj= context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();

//         Laptop lap = context.getBean(Laptop.class); //we pass the class of which we want to get the object
//         lap.compile();

	}

}

/*Note:-
* In spring Object is called beans.
* Spring Creates Objects inside the container inside JVM and to get access to that container we use Application context
 */