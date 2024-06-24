// Updating objects using hql - hibernate query language

package com.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlExample3 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // Creating query 
        Query query = session.createQuery("update Student set city=:c where name=:n");
        query.setParameter("c", "Lauterbraunen Switzerland");
        query.setParameter("n", "Aditya Pawar");
        int r = query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Updated successfully.." + r);
        session.close();
        sessionFactory.close();
    }
}
