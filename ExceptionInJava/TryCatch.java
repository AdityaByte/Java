/*
 * In Java exception is an “unwanted or unexpected event”,
 *  that occurs during the execution of the program.
 *  When an exception occurs, the execution of the program gets terminated.
 *  To avoid these termination conditions we can use try catch block in Java.
 *  In this article,we will learn about Try, catch, throw, and throws in Java.
 */

public class TryCatch {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }    
}
