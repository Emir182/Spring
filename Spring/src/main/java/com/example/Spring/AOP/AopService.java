package com.example.Spring.AOP;
import org.springframework.stereotype.Component;

@Component
public class AopService {

    @LogExecutionTime
    public void getAllUsers(){
        System.out.println("The users are not available now!");
    }

    @LogExecutionTime
    public void saveUser(){
        System.out.println("Saving user!!");
    }


    @LogExecutionTime
    public void HelloWorld(){
        System.out.println("Hello World");
    }

    public AopService(){}

}
