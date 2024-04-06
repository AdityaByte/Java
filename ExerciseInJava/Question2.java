// To find the largest and the smallest element in an array

import java.util.Arrays;

public class Question2{
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,8,9,6};
        System.out.println(largestElement(arr));
        System.out.println(smallestElement(arr));
    }

    static int largestElement(int[] arr){
        Arrays.sort(arr);
        int last_index = arr.length - 1;
        return arr[last_index];
    }

    static int smallestElement(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
