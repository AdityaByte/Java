// Take 10 integer inputs from user and store them in an array and print them on screen.

import java.util.Scanner;

public class Question3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of an array = ");
        int lengthOfArray[] = new int[s.nextInt()];
        for(int i=0; i<lengthOfArray.length; i++){
            System.out.print( (i+1) + "=> ");
            lengthOfArray[i] = s.nextInt();
        }
        System.out.print("{ ");
        for(int num: lengthOfArray){
            System.out.print( num + ",");
        }
        System.out.print(" }");
    }
}
