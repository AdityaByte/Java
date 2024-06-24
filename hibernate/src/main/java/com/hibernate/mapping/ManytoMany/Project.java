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
@Table(name = "project")
public class Project {
    
    @Id
    @Column(name = "pid")
    private int projectId;
    @Column(name = "p_name")
    private String projectName;

    @ManyToMany
    @JoinTable(
        name = "jt_pro", 
        joinColumns = {
            @JoinColumn(name="pid")
        } , 
        inverseJoinColumns = {
            @JoinColumn(name = "eid")
        }
        )
    private List<Emp> employees;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Emp> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Emp> employees) {
        this.employees = employees;
    }

    
}
