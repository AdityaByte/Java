package com.hibernate.xmlmapping;

import org.hibernate.Session;

import com.hibernate.hql.SessionMaker;

public class Main {
    public static void main(String[] args) {
        Session session = SessionMaker.makeSession("com/hibernate/xmlmapping/Hibernate.cfg.xml");
        session.beginTransaction();
        Person p1 = new Person();
        p1.setPid(122);
        p1.setpName("Abhinav kashyap");
        session.save(p1);
        session.getTransaction().commit();
        System.out.println("done....");
        session.close();
    }
}
