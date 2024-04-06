public class ReversingArray{
    public static void main(String[] args) {
        int[] array1 = {12,423,23,54,23,3,2,6,8,5};
        int[] array2 = new int[array1.length];
        // logic
        for(int i=0; i<array1.length; i++){
            array2[i] = array1[array1.length-(i+1)];
        }
        for(int j=0; j<array2.length; j++){
            System.out.print(array2[j] + " ");
        }
    }
}
