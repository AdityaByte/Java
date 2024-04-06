// Write a program to find the sum and product of all elements of an array.

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num =0;
        for(int i=0; i< arr.length; i++){
            num = num + arr[i];
        }
        int num1 = 1;
        for(int j=0; j<arr.length; j++){
            num1 = num1*arr[j];
        }
        System.out.println("sum = "+ num);
        System.out.println("product = " + num1);
    }
}
