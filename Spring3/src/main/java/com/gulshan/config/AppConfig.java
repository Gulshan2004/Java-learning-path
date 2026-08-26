package com.gulshan.config;
import com.gulshan.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

   // @Bean(name= {"com2","desktop1","beast"})
    @Bean
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
