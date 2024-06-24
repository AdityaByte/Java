package com.hibernate.mapping.ManytoMany;

import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("com/hibernate/mapping/ManytoMany/mapping.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        // Creating employees
        Emp e1 = new Emp();
        e1.setEmployeeId(1011);
        e1.setEmployeeName("Raj Grover");

        Emp e2 = new Emp();
        e2.setEmployeeId(1023);
        e2.setEmployeeName("Nischay malhan");

        // Creating projects 
        Project p1 = new Project();
        p1.setProjectId(9867);
        p1.setProjectName("Web scrapper using python");

        Project p2 = new Project();
        p2.setProjectId(8374);
        p2.setProjectName("Video streaming platform using kotlin");

        // Creating list of employee and list of project

        List<Emp> list_emp = new ArrayList<Emp>();
        list_emp.add(e1);
        list_emp.add(e2);

        List<Project> list_project = new ArrayList<Project>();
        list_project.add(p1);
        list_project.add(p2);

        // Setting both projects to e1 employee
        e1.setProjects(list_project);
        // Setting both employees on p2 projects
        p2.setEmployees(list_emp);

        session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);

        session.getTransaction().commit();

        session.close();
        factory.close();

        System.out.println(" All done..... ");
    }   
}
