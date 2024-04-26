// we have studied the private access modifier
// now we have to study about protected , default and public access modifier

// but before that we have to study about constructors 

class Employee{
    private String name;
    private int salary;
    
    
    // we use constructor as a setter for the attributes
    Employee(String name , int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    // getter
    
    public String getName(){
        return name;
    }
    
    public int getSalary(){
        return salary;
    }
}

public class Main{
    public static void main(String args[]){
        Employee obj = new Employee("aditya" , 35000);
        // System.out.println(obj.name); 
      /* this cant run because we set the attributes of the class as private 
      so they can only be accessible inside the class for accessing them 
      outside the class we have to set a get method commanly 
      we can termed the method as getter so we can access the attributes cum variable outside the class
        */
        String name_of_obj = obj.getName();
        int salary_of_obj = obj.getSalary();
        
        System.out.printf(" name : %s and salary : %d \n" , name_of_obj , salary_of_obj);
        
        Employee obj1 = new Employee("adi" , 50000);
        // System.out.println(obj1.name);
        
        String name_of_obj1 = obj1.getName();
        int salary_of_obj1 = obj1.getSalary();
        
        System.out.printf(" name : %s and salary : %d " , name_of_obj1 , salary_of_obj1);
    }
}
