// MultiDimensional Array in java

class Array{
    static void OneDArray(){
        // 1st method
        int[] arr = new int[5]; // You have to specify the size of array here
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 14;
        // 2nd method
        int[] arr1 = {1,2,3,4,5,6}; // You dont have to specify the size it will define it at runtime
    }
    static void TwoDArray(){
        // In a multidimensional array every element in the array is a array itself
        // 1st method
        int[][] arr = new int[2][3]; // You can understand it as 2 rows and 3 colums
        // like-
        arr[0][0] = 10;
        arr[0][1] = 11;
        arr[0][2] = 12;
        //arr[0][3] = 13; // this will throws an error - Index 3 out of bounds for length 3
        arr[1][0] = 20;
        arr[1][1] = 21;
        arr[1][2] = 22;
        // 2nd method
        int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // it has 3 rows and 4 coloums
    }

    static void ThreeDArray(){
        // Three Dimensional Array -
        // 1st method-
        int[][][] arr = new int[1][2][3]; // Visualising a 3d array is kinda difficult but we can assume it as 3d model also
        // 2nd method-
        int[][][] arr1 = {{{1,2,1000},{4,5,6}},{{1,23,5},{6,7,7}},{{12,54,7},{90,53,52}}}; // its a int[3][2][3];
        int a = arr1[0][0][2]; // it must be 1000
        System.out.println("Value of a : "+ a);
    }
}

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Array.OneDArray();
        Array.TwoDArray();
        Array.ThreeDArray();
    }
}
