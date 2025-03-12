package com.alex.exercices.service;

import org.springframework.stereotype.Component;
import com.alex.exercices.model.HelloWorld;

@Component
public class HelloWorldService {
    public HelloWorld getHelloWorld(){
        HelloWorld hello = new HelloWorld();
        hello.setValue("Hello World");
        return hello;
    }
}
