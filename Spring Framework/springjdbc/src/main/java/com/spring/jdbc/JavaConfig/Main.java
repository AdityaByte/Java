package com.spring.jdbc.JavaConfig;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jdbc.JavaConfig.Dao.EmployeeDao;
import com.spring.jdbc.JavaConfig.Entities.Employee;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        EmployeeDao employeeDao = context.getBean("employee" , EmployeeDao.class);
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("Enter employee id -- > ");
        int id = Integer.parseInt(s.nextLine());
        System.out.print("Enter employee name -- > ");
        String name = s.nextLine();
        Employee employee = new Employee();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        int result = employeeDao.addEmployee(employee);
        System.out.println("Employee added..." + result);
        context.close();
    }
}
