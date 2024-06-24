// Hql - Hibernate query language
/* So, we are java programmers if we want to work with the database we have to learn sql which is
 * structured query language but we can handle the database with the orm tool named hibernate it is basically a frameworj of java
 * 1. we can fetch complex as well as singelton data using hql is a simpler task as compared to writing querys and executing it with the help of jdbc
 * 2. it is similar to the sql and other query language bcz sometimes the syntax may differ for different
 *      database like oracle, mysql etc but if we are using hql it may no differ.
 */


package com.hibernate.hql;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;


// In this example we are learning select query in hql..
public class HqlExample1 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        
        // Now we have to fetch any object using hql we have to create a query in hql
        // String query = "from Student where city=:x"; // Its a dynamic query
        String query = "from Student as s where s.name=:n and s.city=:c ";
        Query q = session.createQuery(query);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name -> ");
        String name = scanner.nextLine();
        System.out.print("Enter the city name -> ");
        String city = scanner.nextLine();
        q.setParameter("n", name);
        q.setParameter("c", city);
        List<Student> l1 = q.list();
        for(Student s : l1){
            System.out.println(s);
        }

        session.close();
        factory.close();
    }
}
