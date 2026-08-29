package com.gulshan.config;
import com.gulshan.Alien;
import com.gulshan.Computer;
import com.gulshan.Desktop;
import com.gulshan.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.gulshan")
public class AppConfig {
//
//    @Bean
//    @Qualifier("desktop")
//    public Alien alien(@Autowired Computer com) { //here writing @Autowired is optional.
//        Alien obj = new Alien(); //creating the alien object
//        obj.setAge(25); //setting the value for age
//        obj.setCom(desktop()) ; //NOTE:- passing the desktop causes tight coupling so we can just pass Computer object as parameter in the alien()
//        obj.setCom(com) ;
//        return obj;
//    }
//
//
//   // @Bean(name= {"com2","desktop1","beast"})

//    @Bean
//    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
