// Question - Find the sum of n natural number by recursive method

public class Test{
    // recursion method
    // sumation of n natural numbers is = 1 + 2 + 3 + ... + n-1 + n
    // => sum(n-1) + n and conditon for n=1 is returns 1
    static int sumRect(int n){
        if(n == 1){
            return 1;
        }
        return n + sumRect(n-1);
    }

    public static void main(String[] args) {
        int result = sumRect(3);
        System.out.println(result);
    }
}
