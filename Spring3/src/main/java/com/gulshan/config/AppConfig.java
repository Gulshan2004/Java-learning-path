package com.gulshan.config;
import com.gulshan.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

   // @Bean(name= {"com2","desktop1","beast"})
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
