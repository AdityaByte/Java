/*
1.Create an array of 5 floats and calculate their sum.
2.Write a program to find out whether a given integer is present in an array or not.
3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
4.Create a Java program to add two matrices of size 2x3.
5.Write a Java program to reverse an array.
6.Write a Java program to find the minimum and maximum element in an array.
7.Write a Java program to find whether an array is sorted or not.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

class Questions{

    static void q1(){
    //1.Create an array of 5 floats and calculate their sum.
        float[] arr = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 0;
        int i=0;
        while(i<arr.length){
            num += arr[i];
            i++;
        }
        System.out.println("Question 1 - Answer => " + num);
        // code with harry example
        float sum = 0;
        for(float element:arr){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);
    }

    static void q2(){
        // 2.Write a program to find out whether a given integer is present in an array or not.
        int[] arr = {1,2,3,5,6,7,9};
        int target = 33;
        boolean bool = false;
        for(int a: arr){
            if(target == a){
                bool = true;
                break;
            }
        }
        if(bool){
            System.out.println("Yeah the value is present in the array");
        }
        else{
            System.out.println("No , the value is not present in the array");
        }
    }

    static void q3(){
        // 3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        float[] physics_marks = {55,78,93,84,74};
        float sum =0;
        for(float a: physics_marks){
            sum += a;
        }
        float avg = sum/physics_marks.length;
        System.out.println("the average of the marks of physics is = " + avg);
    }

    static void q4(){
        //4.Create a Java program to add two matrices of size 2x3.
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{4,5,6},{1,2,3}};
        int[][] sumArray = new int[2][3];
        for(int i=0; i<sumArray.length; i++){
            for(int j=0; j<sumArray[i].length; j++){
                sumArray[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void q5(){
        // 5.Write a Java program to reverse an array.
        int[] arr0 = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = new int[9];
        for(int i=0; i< arr0.length; i++){
            arr1[i] = arr0[arr0.length-(i+1)];
        }
        System.out.println(Arrays.toString(arr1));
    }

    static void q6(){
       // 6.Write a Java program to find the minimum element in an array.
        int[] arr = {1, 2100, 3, 455, 5, 34, 67};
        Arrays.sort(arr);
        System.out.println("Minimum element of an array is = "+arr[0]);
        System.out.println("Maximum element of an array is = "+arr[arr.length-1]);
    }

    static void q7(){
    //7.Write a Java program to find whether an array is sorted or not.
        boolean isSorted = true;
        int[] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0; i< arr.length; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Yes , the array is sorted");
        }
        else {
            System.out.println("No , the array is not sorted");
        }
    }
}


public class Test {
    public static void main(String[] args) {
        //Questions.q1();
        //Questions.q2();
        //Questions.q3();
        //Questions.q4();
        //Questions.q5();
        //Questions.q6();
        //Questions.q7();
    }
}
