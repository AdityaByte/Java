/**
 * MathInJava
 */
public class MathInJava {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Math.min(x,y) method used to find minimum value of x and y
        System.out.println(Math.min(a, b)); 

        // Math.max(x,y) method used to find maximum value of x and y
        System.out.println(Math.max(a, b));

        // Math.sqrt(x) method returns the square root of x

        int c = 64;
        System.out.println(Math.sqrt(c));

        // Math.abs(x) method returns the absolute (positive) value of x

        int d = -12;
        System.out.println(Math.abs(d));

        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)

        System.out.println(Math.random());

        int randomNumber = (int)(Math.random()*100); // it returns integer varies from 0 to 100

        System.out.println(randomNumber);

        
    }
}