package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {

    @Bean(name={"pakoda"})
    public Pakoda getPakoda(){
        return new Pakoda();
    }
   
    @Bean(name = {"student"})
    public Student getStudent(){
        return new Student(getPakoda());
    }
}
