package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanscope/scopeconfig.xml");

        /*
        // Decalring object of student class
        Student s1 = (Student) context.getBean("s1");
        Student s2 = context.getBean("s1" , Student.class);
        
        boolean b1 = s1.hashCode() == s2.hashCode(); // it returns true because no other object is created because we are using the singleton scope
        // If we use prototype as a scope it will return false
        System.out.println(b1); // now it returns false on prototype scope
        */

        Teacher t1 = (Teacher) context.getBean("t1");
        Teacher t2 = (Teacher) context.getBean("t1");
        System.out.println("hashcode of t1 object -> "+t1.hashCode());
        System.out.println("hashcode of t2 object -> "+t2.hashCode());
        System.out.println(t1.getTeacherName());
        System.out.println(t2.getTeacherName());
    }
}
