package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    // here we are using an expression by @Value annotation
    @Value("#{12+12+90}")
    private int number;

    // invoking static method using spel
    // @Value("#{ T(java.lang.Math).sine(90) }")
    private double sineValue;

    // injecting static variable using spring expression language
    @Value("#{ T(java.lang.Math).PI }")
    private double pi;

    // how to create object and inject in variable using spel
    @Value("#{ new java.lang.String('Aditya pawar') }")
    private String name;

    @Value("#{3>1}")
    private boolean b1;

    @Override
    public String toString() {
        return "Demo [number=" + number + ", sineValue=" + sineValue + ", pi=" + pi + ", name=" + name + ", b1=" + b1
                + "]";
    }

    
}
