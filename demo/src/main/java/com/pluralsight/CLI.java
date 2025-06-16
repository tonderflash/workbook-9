package com.pluralsight;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLI implements CommandLineRunner {

    @Override
    public void run(String... args)  {
        System.out.println("Hi");
    }

    public void doSomething() {
        run("Hello", "World", "!");
        System.out.println("Doing something");
    }

    
   
}
