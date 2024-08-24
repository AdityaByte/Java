package com.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.Customer;

/*
 * create - you need transaction for these three
 * read 
 * update - you need transaction for these three
 * delete - you need transaction for these three
 */

public class CustomerDao {

    private HibernateTemplate hibernateTemplate;

    // create operation using spring orm
    @Transactional
    public int insert(Customer customer){
        Integer i = (Integer) this.hibernateTemplate.save(customer);
        return i;
    }

    // fetching single data using spring orm
    public Customer fetch(int cid){
        Customer c1 = this.hibernateTemplate.get(Customer.class, cid);
        return c1;
    }

    // Fetching all data using spring orm 
    public List<Customer> fetchAll(){
        List<Customer> customers = this.hibernateTemplate.loadAll(Customer.class);
        return customers;
    }

    // Deleting object using spring orm
    @Transactional
    public void deleteData(int cid){
        Customer c1 = this.hibernateTemplate.get(Customer.class , cid);
        this.hibernateTemplate.delete(c1);
    }

    // updating data using spring orm
    @Transactional
    public void updateData(Customer customer){
        this.hibernateTemplate.update(customer);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

}
