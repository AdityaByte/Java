package com.hibernate.caching;

import org.hibernate.Session;

import com.hibernate.Student;
import com.hibernate.hql.SessionMaker;

public class FirstLevelCache {
    public static void main(String[] args) {
        Session session = SessionMaker.makeSession("hibernate.cfg.xml");
        Student s1 = session.get(Student.class, 1);
        System.out.println(s1);
        Student s2 = session.get(Student.class, 1); //  Session dont fire the query second time while fetching the same object
        System.out.println("wait a minute");
        System.out.println(s2);
        Student s3 = session.load(Student.class, 10);
        System.out.println(session.contains(s1)); // This will returns true
    }
}
