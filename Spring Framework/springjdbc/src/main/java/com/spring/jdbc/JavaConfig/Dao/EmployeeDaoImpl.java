package com.spring.jdbc.JavaConfig.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.JavaConfig.Entities.Employee;

@Component("employee")
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    @Override
    public int addEmployee(Employee employee) {
        String query = "insert into employee(id,name) values(?,?)";
        int result = this.jdbcTemplate.update(query, employee.getEmployeeId() , employee.getEmployeeName());
        return result;
    }
}
