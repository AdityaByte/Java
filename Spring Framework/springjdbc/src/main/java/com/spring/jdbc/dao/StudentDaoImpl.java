package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao{
    
    private JdbcTemplate jdbcTemplate;
    
    public int insert(Student student){
        // insert query
        String query = "insert into student(id,name,city) values(?,?,?)";
        // Fire the query
        int result = this.jdbcTemplate.update(query, student.getId() , student.getName() , student.getCity());
        return result;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    // Implementing the change method of the studentdao class
    public int change(Student student){
        // update query
        String query = "update student set name=? , city=? where id=?";
        // fire the update query
        int result = this.jdbcTemplate.update(query, student.getName() , student.getCity() , student.getId());
        return result;
    }

    // Implementing the delete method of the studentdao class
    public int delete(int studentId){
        // Delete query
        String query = "delete from student where id=?";
        // fire the delete query
        int result = this.jdbcTemplate.update(query, studentId);
        return result;
    }
    
    // Implementing the select method of the studentdao class
    public Student select(int studentId){
        // Retriving rowMapper object
        RowMapper<Student> rowMapper = new RowMapperImpl();
        // Selecting single student data
        String query = "select * from student where id=?";
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper , studentId);
        return student;
    }

    // Implementing the selectMultiple method of the studentdao class
    public List<Student> selectMultiple(){
        String query = "select * from student";
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
        return students;
    }
}
