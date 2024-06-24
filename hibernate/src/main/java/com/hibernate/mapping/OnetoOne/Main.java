package com.hibernate.mapping.OnetoOne;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class AddData{
    public void addData(Session session){
        session.getTransaction();
        // Creating answer object
        Answer a1 = new Answer(12 , "django is the python framwork");
        Answer a2 = new Answer(23 , "We style elements with the help of xml");

        // Creating question object
        Question q1 = new Question(21 , "what is django" , a1);
        Question q2 = new Question(32 , "In android dev how we style elemets" , a2);
        
        session.save(q1);
        session.save(q2);
        session.save(a1);
        session.save(a2);

        session.getTransaction().commit();

        System.out.println("Fetching data....");
        Question question = (Question) session.get(Question.class, 21);
        System.out.println("Que - " + question.getQuestion());
        System.out.println("Ans - " + question.getAnswer().getAnswer());
    }
}

class FetchData{
    public void fetchData(Session session){
        
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Question id -> ");
        int id = Integer.parseInt(s.nextLine());
        Question question = (Question) session.get(Question.class, id);
        System.out.println("Que - " + question.getQuestion());
        System.out.println("Ans - " + question.getAnswer().getAnswer());
    }
}

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("com/hibernate/mapping/OnetoOne/mapping.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        new FetchData().fetchData(session);
        session.close();
        System.out.println("All done....");
    }
}
