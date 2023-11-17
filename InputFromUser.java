// Taking Input From User in Java

// First you need to import external library named as scanner class
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey there , ");
        System.out.print(" What's your name -  ");
        String name = scanner.nextLine(); 

        System.out.println("Hello " + name + " nice to meet you sir");

        // nextint for int
        // nextfloat for float
        // next for string but there is a problem with that if you use only next then it reads only one word and dont read the next one
        

    }
}
