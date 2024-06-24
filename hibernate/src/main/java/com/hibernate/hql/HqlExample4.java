// Executing Join query using hibernate query language
// Here we are using one to many mapping relationship for executing the hql query

package com.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.Arrays;
import java.util.List;

public class HqlExample4 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Session session = SessionMaker.makeSession("com/hibernate/mapping/OnetoMany/mapping.cfg.xml");
        String query = "select s.sid , s.site_url , u.name from Site as s INNER JOIN s.users as u";
        Query q = session.createQuery(query);

        List<Object []> list1 = q.getResultList();
        for(Object[] arr : list1){
            System.out.println(Arrays.toString(arr));
        }
    }
}
