package com.hibernate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

// In this method we are taking an example how you can create table of the refernce type variable
public class embedable {
    public static void main(String[] args)  {
        // Here we have to build session factory
        SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        //Creating the object of the student class
        Student st1 = new Student(101 , "Aditya pawar" , "america" , new Certificate("ML with python" , "12 months"));
        Student st2 = new Student(102 , "abhinav gupta" , "panipat" , new Certificate("ios dev with swift" , "7 months"));
        session.beginTransaction();
        session.save(st1);
        session.save(st2);
        session.getTransaction().commit();
        session.close();
        System.out.println("Done....");
    }
}
