package com.springcore.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Here we are creating bean using configuration file manually and controlling the scope of bean

public class Student {
    private String name;

    public void setName(String name){
        this.name =name;
    }

    public String getName(){
        return name;
    }

}
