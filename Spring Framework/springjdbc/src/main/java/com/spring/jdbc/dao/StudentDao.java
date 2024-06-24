// In the dao package it has all the methods which deals with the database

package com.spring.jdbc.dao;

import com.spring.jdbc.entites.Student;
import java.util.List;

public interface StudentDao {
    // This is for inserting data to the database
    public int insert(Student student);
    // This is for updating data in the database
    public int change(Student student);
    // This is for deleting data in the database
    public int delete(int studentId);
    // This is for selecting data from the database using rowmapper
    public Student select(int studentId);
    // This if for selecting all data from the database
    public List<Student> selectMultiple();
}
