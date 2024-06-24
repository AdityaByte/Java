package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        A objA = (A) context.getBean("aref");
        System.out.println(objA.getX());
        System.out.println(objA.getObjB().getY());
        System.out.println(objA);
    }
}
