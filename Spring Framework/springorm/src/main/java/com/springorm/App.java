package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import com.springorm.dao.CustomerDao;
import com.springorm.entities.Customer;

public class App {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        CustomerDao customerDao = context.getBean("customerDao" , CustomerDao.class);
        Customer c1 = new Customer(345 , "abhishek pandit");
        int r = customerDao.insert(c1);
        System.out.println("Donee........." + r);
        Thread.sleep(4000);
        Customer c2 = customerDao.fetch(124);
        System.out.println(c2.getcName());
        List<Customer> l1 = customerDao.fetchAll();
        for(Customer c: l1){
            System.out.println(c.getCid() + " : " + c.getcName());
        }

        customerDao.deleteData(124);

        Customer c3 = new Customer(234, "anand kumar");
        customerDao.updateData(c3);
    }
}