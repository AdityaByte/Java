package com.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionMaker {
    public static Session makeSession(String configFile){
        Configuration configuration = new Configuration();
        configuration.configure(configFile);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    } 
}
