// recursion in java 
// recursion means a function calls itself in simple terms
// let us make a class in which it gives sum of previous two digits upto n value

/*
let n = 8 natural numbers
1 2 3 4 5 6 7 8 
n n-1 n-2 n-3 n-4 n-5 n-6 n-7 and n-7=1 return 1

*/

class Recursion{
    public int recursiveFunction(int n){
        int sum = 0;
        if(n==1){
            return 1;
        }
        else{
            sum = n + recursiveFunction(n-1);
        }
        return sum;
    }
}

public class Main{
    public static void main(String[] args){
        Recursion object = new Recursion();
        int result = object.recursiveFunction(200);
        System.out.println(result);
    }
}
