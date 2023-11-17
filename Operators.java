// OPERATORS IN JAVA 
/*
 * 1) Arithmetic operators
 * 2) Assignment operators
 * 3) Comparision operators
 * 4) Logical operators
 * 5) Bitwise operators
 */

public class Operators {
    public static void main(String[] args) {
        
/* 1) Arithmetic operators - Arithmetic operator performs arithmetic operations
 *        such as addition, subtration, modulus etc. 
*/
    
        System.out.println("ARITHMETIC OPERATORS - ");

        int num1 = 20;
        int num2 = 10;

        System.out.println(num1 + num2); // addition
        System.out.println(num1 - num2); // subtraction
        System.out.println(num1 * num2); // multiplication
        System.out.println(num1 / num2); // Division
        System.out.println(num1 % num2); // Modulus - gives remainder

        // Note - Always deal in float or double instead of int because of this 

        int number1 = 122;
        int number2 = 10;
        System.out.println(number1 / number2); // it gives 12 as an output instead of 12.2

        float numm1 = 122;
        float numm2 = 10;
        System.out.println(numm1 / numm2); // it gives 12.2 as output

        // Increament (++) and Decreament(--) operator in Java

        int a = 10;
        ++a; // Increases the value by 1
        System.out.println(a);

        int b = 10;
        System.out.println(--b); // Decreases the value by 1

/* 
 * Assignment Operators - assignment operators means it assigns value means like = , += , -= etc
 */

        System.out.println("ASSIGNMENT OPERATORS");
        
        // = assigns new value to it
        int number3 = 100;
        number3 += 100; // it means number3 = number3 + 100 you can also declare it as an another variable but it looks pretty long
        System.out.println(number3); 
        // number3 = 200
        number3 -= 50; // it means number3 = number3 - 50
        System.out.println(number3);
        // number3 = 150
        number3 *= 10; // it means number3 = number3 * 10
        System.out.println(number3);
        // number3 = 1500
        number3 /= 15; // it means number3  = number3 / 15
        System.out.println(number3);
        // number3 = 100
        number3 %= 9; // it means number3  = number3 % 9 -- it gives 1 as remainder bc number3 = 100
        System.out.println(number3);

/*
 * Comparision Operators - Comparison operators are used to compare two values (or variables).
 * The return value of a comparison is either true or false
 */

        System.out.println("COMPARISION OPERATORS - ");
        
        // == - is equal to or not if equal then it gives true if not then it gives false
        String alph1 = "Aditya";
        String alph2 = "aditya";
        System.out.println(alph1 == alph2);  //equal to

        int number11 = 12;
        int number22 = 13;

        System.out.println(number11 == number22); // equal to - false

        System.out.println(number11 != number22); // Not equal to - true

        System.out.println(number11 > number22); // greater than - false

        System.out.println(number11 < number22); // less than - true

        System.out.println(number11 >= number22); // Greater than equal to - false

        System.out.println(number11 <= number22); // smaller than equal to - true maybe

/* 
 * Logical Operators - You can also test for true or false values with logical operators.
 *                    Logical operators are used to determine the logic between variables or values:
 */

        System.out.println("LOGICAL OPERATORS");

        int x = 100;
        int y = 120;
        
        // And operator - && - it gives true when all the statements are true ex-
        
        System.out.println(x>y && x<y); // x < y is true it gives false bc
        // instead of this if u write this code
        System.out.println(x!=y && x<y && x<=y); // it gives true

        // OR operator - || - it gives false when all condition are false and true when any one of them is true
        System.out.println(x>y || x<y); //it gives true

        boolean bool = true;
        System.out.println(!bool); // true -> false and vice versa

    }
}
