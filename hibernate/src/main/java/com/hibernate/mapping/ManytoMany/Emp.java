package com.hibernate.mapping.ManytoMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "employee")
public class Emp{

    @Id
    @Column(name = "eid")
    private int employeeId;
    @Column(name = "e_name")
    private String employeeName;

    @ManyToMany
    @JoinTable(
        name = "jt_emp",
        joinColumns = {
            @JoinColumn(name = "eid")
        } ,
        inverseJoinColumns = {
            @JoinColumn(name = "pid")
        }
    )
    private List<Project> projects;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    
}