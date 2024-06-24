package com.hibernate.caching;

import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SecondLevelCache {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        // Creating first session
        Session session = factory.openSession();
        // Fetching object
        session.get(Student.class, 4);
        //Closing the session
        session.close();

        // Creating another session
        Session session2 = factory.openSession();
        // fetching the same object one more time
        session2.get(Student.class, 4);
        //closing the session
        session2.close();

        // now at last closing the factory object
        factory.close();
    }
}
