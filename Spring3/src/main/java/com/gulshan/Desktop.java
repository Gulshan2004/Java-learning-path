package com.gulshan;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("desk1")
@Primary
@Scope("prototype")
public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop Object Created");
    }
    @Override
    public void compile(){
        System.out.println("compiling using Desktop");
    }
}