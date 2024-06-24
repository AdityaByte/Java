package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.ObjectNotFoundException;

// This class is for fetching data from the database
public class FetchData {
    public static void main(String[] args) {
        // Here we have to configure the hibernate configuration file 
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        // Now we have to build the SessionFactory 
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // We have to open the session by the sessionFactory object
        Session session = sessionFactory.openSession();
        //Here we can get the object from the database by the get method or by means of the load method
        // The main difference in bet. the get() and the load() method is that the get method returns null when it doesnt get
        // the object but the load() method returns ObjectNotFound
        Student student = (Student) session.get(Student.class, 201);
        if(student==null){
            System.out.println("No data found object is null");
        }else{
            System.out.println(student);
        }

        // Now we want to fetch Address Table data by using load() method
        try{
            Address address = (Address) session.load(Address.class, 2);
            System.out.println(address);
        }catch(ObjectNotFoundException e){
            System.out.println("Object not found exception occurs.....");
        }
    }
}
