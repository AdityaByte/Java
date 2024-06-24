package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("my program is started...");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        // // Spring jdbc -> JdbcTemplate
        // JdbcTemplate template = context.getBean("jdbcTemplate" , JdbcTemplate.class);
        // // Insert query
        // String query = "insert into student(id,name,city) values(?,?,?)";
        // // Fire the query
        // int result = template.update(query, 123 , "suhansh" , "indore");
        // System.out.println("No of records inserted .. -> " + result);

        // Rather than doing the previous implemented method use this method
        StudentDao studentDao = context.getBean("studentDao" , StudentDao.class);
        
        while (true) {
            @SuppressWarnings("resource")
            Scanner s = new Scanner(System.in);
            System.out.println("What you want to do \n 1. Add some data to the database \n 2.Update data to the database via id \n 3. Delete data from the database via id \n 4. Want to select single data from database.. via id \n 5. Want to fetch all data.. \n 6. Quit the program..end \n select by 1 or 2 or 3 or 4 or 5 or 6");
            System.out.print("Answer ==> ");
            int ans = Integer.parseInt(s.nextLine());
            if(ans == 1){
                System.out.print("Enter id of the student -> ");
                int id = Integer.parseInt(s.nextLine());
                System.out.print("Enter name of the student -> ");
                String name = s.nextLine();
                System.out.print("Enter city in which he/she lives - > ");
                String city = s.nextLine();
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setCity(city);
                int result = studentDao.insert(student);
                System.out.println("No of records inserted .. " + result);
            }
            else if(ans == 2){
                Student update_student = new Student();
                System.out.print("Enter the id -> ");
                int id = Integer.parseInt(s.nextLine());
                System.out.print("Enter Name -> ");
                String name = s.nextLine();
                System.out.print("Enter city -> ");
                String city = s.nextLine();
                update_student.setId(id);
                update_student.setName(name);
                update_student.setCity(city);
                int result = studentDao.change(update_student);
                System.out.println("Student updated.. " + result);
            }
            else if(ans==3){
                System.out.print("Enter the id of the student --> " );
                int id = Integer.parseInt(s.nextLine());
                int result = studentDao.delete(id);
                System.out.println("Deleted data successfully .. " + result);
            }
            else if(ans == 4){
                System.out.print("Enter id of the student.. --> ");
                int id = Integer.parseInt(s.nextLine());
                Student student = studentDao.select(id);
                System.out.println(student);
            }
            else if(ans == 5){
                List<Student> students = studentDao.selectMultiple();
                for(Student student : students){
                    System.out.println(student);
                }
            }
            else if (ans == 6){
                System.out.println("Closing the program");
                break;
            }
            try {
                Thread.sleep(1000);
                System.out.println("....");
                Thread.sleep(2000);
                System.out.println();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        context.close();
    }
}
