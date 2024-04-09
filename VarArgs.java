// VarArgs - Variable Arguments in Java

public class VarArgs{

  // here arr is an array which stores the values given from the arguments
    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("the sum of 1,2,3,4 is = " + sum(1,2,3,4));
    }
}
