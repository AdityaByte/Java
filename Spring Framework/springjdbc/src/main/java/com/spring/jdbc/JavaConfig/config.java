package com.spring.jdbc.JavaConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.JavaConfig.Dao"})
public class config {

    // Jdbc Template object --->
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("aditya");
        return ds;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }

    // This is the manual refernece injection we can also do it by autowiring
    // @Bean(name = {"employee"})
    // public EmployeeDao getEmployeeDao(){
    //     EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
    //     employeeDao.setJdbcTemplate(getJdbcTemplate());
    //     return (EmployeeDao) employeeDao;
    // }

}
