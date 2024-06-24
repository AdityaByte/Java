package com.hibernate.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.hibernate.Student;
import com.hibernate.hql.SessionMaker;

public class SqlExample1 {
    public static void main(String[] args) {
        Session session = SessionMaker.makeSession("hibernate.cfg.xml");
        String query = "select * from student";
        NativeQuery nq = session.createSQLQuery(query);
        List<Object []> l1 = nq.list();
        for(Object[] arr : l1){
            System.out.println(Arrays.toString(arr));
        }
    }
}
