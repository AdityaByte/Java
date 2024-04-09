// Recursion in java

public class Recursion {

    // By Recursive apporach
    static int factorial(int n){
        if(n==0 || n==1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    // By iterrative approach
    static int factorial_iterrative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int r = 1;
            for (int i = n; i > 0; i--) {
                r *= i;
            }
            return r;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial by recursive method = " + factorial(5));
        System.out.println("Factorial by itterative method = " + factorial_iterrative(5));
    }
}
