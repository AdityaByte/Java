// rename this file to Main.java before running it to your system
// here in this code we learn about how the object is made , what is referance variable , what is instance variable ?
// => ClassName(Class can be called as a datatype-nonprimitive) reference_variable = new(keyword - which makes the object in runtime) ClassName()- this is generally a function called as constructor ;
// how the constructor made how it works ?
// => Constructors can be made by java itself or we can put out some values to it and make it functionable
// what is the this keyword ?
// => this keyword is generally refers to the local variables of the class or it rename it by the object who it was calling it
// what is the dot(.) seperator and how it works for declaring or calling out a function inside a class with the help of object ?

public class Main{
    public static void main(String[] args){

      // first object
        Student aditya = new Student(12, "aditya", 89.9f);
        // System.out.println(aditya.toString());
        System.out.println(aditya.rollNum);
        System.out.println(aditya.name);
        System.out.println(aditya.marks);

      // second object
        Student rahul = new Student(14, "rahul", 67.9f);
        System.out.println(rahul.rollNum);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        // calling out the function by the .keyword
        aditya.greeting();

        Student random = new Student();
        System.out.println(random.rollNum);
        System.out.println(random.name);
        System.out.println(random.marks);
    }
}

// This java class is working as a template for the object
class Student{
    int rollNum;
    String name;
    float marks;

    void greeting(){
        System.out.println("hey coders");
    }

    Student(){
        // this is how you call a constructor from an another constructor
        // internally it is converting like Student(15,"abhi",99.9f); and calling this constructor cum function
        this (15 , "abhi" , 99.9f);
    }
    // here is the constructor
    // constructors dont have a return type the class is itself the return type
    Student (int rno, String name, float marks) {
        this.rollNum = rno;
        this.name = name;
        this.marks = marks;
    }
}
