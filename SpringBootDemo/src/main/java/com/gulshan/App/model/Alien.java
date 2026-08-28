package com.gulshan.App.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;
    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        com.compile();
    }
}

/*NOTE:-
* @Component annotation is used to tell spring whether to create object of that particular class or not this allows spring to create , assemble and manage the opbject .
* @AutoWired  used in Spring to automatically inject dependencies, using it spring  will automatically search for laptop object inside the container this is Called wiring ,
*/