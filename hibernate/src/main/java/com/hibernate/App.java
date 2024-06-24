package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException , SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
        System.out.println("program started...");
        // We have to get the session factory object
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        System.out.println(factory.isClosed());

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Id -> ");
        int id = Integer.parseInt(s.nextLine());
        System.out.print("Enter Name -> ");
        String name = s.nextLine();
        System.out.print("Enter city -> ");
        String city = s.nextLine();

        // Creating certificate class object
        System.out.print("Enter course Name -> ");
        String course = s.nextLine();
        System.out.print("Enter duration -> ");
        String duration = s.nextLine();

        // Creating student object
        Student student = new Student(id , name , city , new Certificate(course , duration));
        System.out.println(student);

        //Creating Address object
        //For saving the image;
        FileInputStream fis = new FileInputStream("F:\\redmi_10_backup\\DCIM\\Camera\\1671182023567.jpg");
        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        fis.close();
        Address address = new Address(111, "los angles", "america", 12.12, true, new Date(), arr);

        // We have to open the session from the session factory for saving the object to the database
        System.out.println("Opening session");
        Session session = factory.openSession();
        // Now we have to get the transaction from the session
        System.out.println("Begining transaction");
        session.beginTransaction();
        System.out.println("Saving the session object");
        session.save(student);
        System.out.println("saving the address object");
        session.save(address);
        System.out.println("Commiting the session");
        session.getTransaction().commit();
        System.out.println("Closing the session");
        session.close();
    }
}
