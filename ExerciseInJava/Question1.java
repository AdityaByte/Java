// Question = Make an input from the user and find the sum of square of each number ?

import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = s.nextInt();
        int i =0;
        while(num > 0){
            int r = num%10;
            int s1 = i + (r*r);
            i = s1;
            int num1 = (int)Math.floor(num/10);
            num = num1;
        }
        System.out.println(i);
        
    }
}
