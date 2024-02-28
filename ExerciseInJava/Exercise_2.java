// Exercise 2 -
/***
 *  Write a program to find out whether a student is pass or fail
 *  if it requires total 40 percent and at least 33 percent
 *  in each subject to pass. Assume 3 subjects and take marks
 *  as an input from the user
 ***/


import java.util.Scanner;

class Exercise_2{

    Scanner s = new Scanner(System.in);
    void exerciseFunc(){
        System.out.print("PHYSICS => ");
        float phys = s.nextFloat();
        System.out.print("CHEMISTRY => ");
        float chem = s.nextFloat();
        System.out.print("MATHEMATICS => ");
        float math = s.nextFloat();

        float calc = (phys + chem + math) / 3 ;

        if(calc >=40 && phys>=33 && chem>=33 && math>=33){
            System.out.println("PASSED !!!!");
            System.out.printf("You got -> %f" , calc);
        }
        else{
            System.out.println("FAILED :((");
            System.out.printf("You got -> %f" , calc);
        }
    }
}

public class Test{
    public static void main(String[] args) {
        Exercise_2 obj = new Exercise_2();
        obj.exerciseFunc();
    }
}
