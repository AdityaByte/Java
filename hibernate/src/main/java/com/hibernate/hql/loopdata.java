package com.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Certificate;
import com.hibernate.Student;

public class loopdata {
    public static void main(String[] args) {
        Session session = SessionMaker.makeSession("hibernate.cfg.xml");
        session.beginTransaction();
        for(int i=1 ; i<=20 ; i++){
            Student student = new Student(i , "name"+i , "city"+i , new Certificate("course"+i , i+ " month")); 
            session.save(student);
        }
        session.getTransaction().commit();
        session.close();
    }
}
