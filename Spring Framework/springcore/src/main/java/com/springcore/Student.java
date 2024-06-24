package com.springcore;

public class Student {
    private String studentId;
    private String studentName;
    private String studentAddress;
    
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        System.out.println("Setting student id..");
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        System.out.println("Setting student name..");
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        System.out.println("Setting student address..");
        this.studentAddress = studentAddress;
    }
    public Student(String studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + "]";
    }
    
}
