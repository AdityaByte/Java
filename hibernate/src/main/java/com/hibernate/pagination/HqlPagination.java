// Pagination is the process of displaying data on multiple pages rather on a single page

package com.hibernate.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.hibernate.Student;
import com.hibernate.hql.SessionMaker;

public class HqlPagination {
    public static void main(String[] args) {
        Session session = SessionMaker.makeSession("hibernate.cfg.xml");
        Query<Student> query = session.createQuery("from Student" , Student.class);
        // Implementing pagination using hql query
        query.setFirstResult(10); // index starts from 0 here 10-11 
        query.setMaxResults(5); 
        List<Student> l1 = query.getResultList();
        for(Student s : l1){
            System.out.println(s);
        }
    }
}
