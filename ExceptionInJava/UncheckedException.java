// UnChecked Exception 
// These are the exceptions that are not checked at the compile time
/*
 * In short unchecked exceptions are runtime exceptions that are not 
 * required to be caught or declared in a throws clause. 
 * These exceptions are usually caused by programming errors, 
 * such as attempting to access an index out of bounds in an array or
 *  attempting to divide by zero.
 * 
 * RunTime Exceptions Example-
 * 1. ArrayIndexOutOfBoundsException
 * 2. NullPointerException
 * 2. ArithmeticException
 * 
 */

public class UncheckedException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a/b; // This throws an arithmetic exception
    }
}
