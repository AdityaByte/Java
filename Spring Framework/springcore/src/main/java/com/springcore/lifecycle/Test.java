package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor; // for annotations

public class Test {
    public static void main(String[] args) {
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
        Samosa s1 = (Samosa) context.getBean("s1");
        System.out.println(s1);

        // registaring shutdown hook and this method is in AbstractApplicationContext
        context.registerShutdownHook();

        Pepsi p1 = (Pepsi) context.getBean("p1");
        System.out.println(p1);

        Jalebi j1 = (Jalebi) context.getBean("j1");
        System.out.println(j1);
    }
}
