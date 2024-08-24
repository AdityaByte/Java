package com.springorm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private int cid;
    @Column(name = "customer_name")
    private String cName;
    
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    public Customer(int cid, String cName) {
        this.cid = cid;
        this.cName = cName;
    }
    public Customer() {
        super();
    }

    
}
