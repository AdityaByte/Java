package com.springcore.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// here we are using annotation method for creating object rather than declaring bean in the xml file

@Component("t1")
@Scope("singleton")
// @Scope("prototype")
public class Teacher {
    @Value("aditya")
    private String teacherName;
    
    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;
    }

    public String getTeacherName(){
        return teacherName;
    }
}
