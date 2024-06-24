package com.hibernate.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.hql.SessionMaker;
import com.hibernate.mapping.OnetoMany.Site;
import com.hibernate.mapping.OnetoMany.User;

public class CascadeExample {
    public static void main(String[] args) {

        Session session = SessionMaker.makeSession("com/hibernate/mapping/OnetoMany/mapping.cfg.xml");
        Transaction tx = session.beginTransaction();

        Site s1 = new Site();
        s1.setSid(234);
        s1.setSite_url("java.hibernate.dev");

        User u1 = new User();
        u1.setUid(23);
        u1.setName("abhishek kumar");

        User u2 = new User();
        u2.setUid(89);
        u2.setName("hritik roshan");

        List<User> l1 = new ArrayList<>();
        l1.add(u1);
        l1.add(u2);

        s1.setUsers(l1);

        session.save(s1);

        tx.commit();

        System.out.println("done....");
        session.close();
    }
}
