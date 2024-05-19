// Array of objects in java

class Student{
    public int rollNo;
    public String name;
    Student(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class ArrayOfObjects{
    public static void main(String[] args) {
        Student arr[];
        arr = new Student[5];

        arr[0] = new Student(1, "Aditya");
        arr[1] = new Student(2, "IDK");
        arr[2] = new Student(3, "nobody");
        arr[3] = new Student(4, "somebody");
        arr[4] = new Student(5, "everybody");
        for(int i=0; i<arr.length; i++)
        System.out.println("rollno : " + arr[i].rollNo + " and the name of student is " + arr[i].name);
    }
}
