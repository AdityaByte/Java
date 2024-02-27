// Switch Case Statement in Java

// NOTE ->
// Here the code takes input as the byte value and according to the cases it gives output
// Use break; statement for ending the case and coming back
// SwitchCase is a static context so non static variable cannot be referred from a static context -- important note

import java.util.Scanner;

public class SwitchCase{

    static Scanner s = new Scanner(System.in); 

    public static void main(String[] args) {
        System.out.print("Enter the number => ");
        byte number = s.nextByte();
        byte num = number;

        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter the number value from 1 to 7");

        }
    }
}
