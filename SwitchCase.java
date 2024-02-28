// Switch Case Statement in Java

// NOTE ->
// Here the code takes input as the byte value and according to the cases it gives output
// Use break; statement for ending the case and coming back
// If you dont make it static - scanner class this will throw an error -> "non-static variable s cannot be referenced from a static context"

import java.util.Scanner;

class ScannerClass{
    static Scanner s = new Scanner(System.in);
}

class Example1{
    static void enterCodeExample(){
        System.out.print("Hey Buddy Enter the code for accessing the library -> ");
        int code = ScannerClass.s.nextInt();
        switch (code){
            case 2001:
                System.out.println("hey you got spell library access , congrats !");
                break;
            case 2004:
                System.out.println("Hey you got potion making books access , congrats!");
                break;
            default:
                System.out.println("You have entered wrong code now Expelliarmus !!");
        }
    }
}

class Example2{
    static void enterPassCode(){
        System.out.print("enter the passcode -> ");
        String passcode = ScannerClass.s.next();
        switch(passcode){
            case "hogwarts":
                System.out.println("welcome to hogwarts");
                break;
            case "harry":
                System.out.println("Hey harry how are you seeing you after a long time");
                break;
            case "draco":
                System.out.println("Draco malfoy.... :)");
                break;
            default:
                System.out.println("Wrong passcode Avada Kedavra");
        }
    }
}



public class Test{
    public static void main(String[] args) {
        Example1.enterCodeExample();
        Example2.enterPassCode();
    }
}
