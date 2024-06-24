package com.hibernate.criteriaapi;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import com.hibernate.Student;
import com.hibernate.hql.SessionMaker;

public class CriteriaApi {
    public static void main(String[] args) {
        Session session = SessionMaker.makeSession("hibernate.cfg.xml");
        Criteria criteria = session.createCriteria(Student.class);
        // criteria.add(Restrictions.eq("name", "name3"));
        // criteria.add(Restrictions.gt("id", 9));
        // criteria.add(Restrictions.like("city", "city1%"));
        
        List<Student> ls = criteria.list();
        for(Student s : ls){
            System.out.println(s);
        }
    }
}
