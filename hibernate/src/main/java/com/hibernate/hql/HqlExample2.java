// Deleting objects using hql - hibernate query language

package com.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlExample2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String q = "delete from Student where city=:x";
        Query query = session.createQuery(q);
        query.setParameter("x", "Punjab");
        int result  = query.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Deleted successfully..." + result);
        session.close();
        sessionFactory.close();
    }
}
