package com.gulshan.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Laptop laptop;
    public void code(){
        laptop.compile();
    }
}

/*NOTE:-
* @Component annotation is used to tell spring whether to create object of that particular class or not this allows spring to create , assemble and manage the opbject .
* @AutoWired  used in Spring to automatically inject dependencies, using it spring  will automatically search for laptop object inside the container this is Called wiring ,
*/