// In this OneToMany annotation we are learning how One Site can have many Users and how many users belongs to the one site.

package com.hibernate.mapping.OnetoMany;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
        Configuration configuration = new Configuration();
        configuration.configure("com/hibernate/mapping/OnetoMany/mapping.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Creating user object
        User user1 = new User();
        user1.setUid(234);
        user1.setName("Aman gupta");
        
        User user2 = new User();
        user2.setUid(456);
        user2.setName("Peeyush bansal");

        // Creating Site object 

        Site site1 = new Site();
        site1.setSid(452);
        site1.setSite_url("spring.io");

        // something
        user1.setSite(site1);
        user2.setSite(site1);
        
        // Here we have to create a list that stores the user
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        site1.setUsers(users);

        session.save(site1);
        session.save(user1);
        session.save(user2);
        session.getTransaction().commit();

        // Fetching data
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the id of the site whom you want to fetch -> ");
        int id = Integer.parseInt(s.nextLine());
        Site site = (Site) session.get(Site.class, id);
        System.out.println(" site id " + site.getSid());
        System.out.println(" site url " + site.getSite_url());
        List<User> u1 = site.getUsers();
        for(User u : u1){
            System.out.println("User id " + u.getUid());
            System.out.println("User name " + u.getName());
        }

        session.close();
        sessionFactory.close();
        System.out.println("done....");


    }
}
