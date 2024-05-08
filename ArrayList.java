// Arraylist in java
// The main basic differnce between the built in array or the arraylist is that we can resize the size of array in arraylist
import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        //Syntax
        ArrayList<String> arr = new ArrayList<String>();

        // If we want to add items in the arraylist
        arr.add("aditya");
        arr.add("somebody");
        arr.add("nobody");
        System.out.println(arr);

        // To get a item in the arrylist
        System.out.println(arr.get(0));

        // To remove a item in the arraylist
        arr.remove(1); // it removes the element which at index no 1
        System.out.println(arr);

        // To set a item in the arraylist
        arr.set(1 ,"somebody");
        System.out.println(arr);

        // addALl() method - it adds the items of the another array list
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("tomato");
        arr1.add("cabbage");
        arr.addAll(arr1);
        System.out.println(arr);

        // clone() method - If we want to create a clone/copy of array list
        ArrayList<String> arrayCopy = (ArrayList<String>)arr1.clone();
        System.out.println(arrayCopy); // it makes the copy of arr1 array // return-type = object

        // contains() method - it returns boolean value - if we want to check a value is exist or not
        boolean c = arr1.contains("cabbage");
        System.out.println(c);
        System.out.println(arr1.contains("tomato"));

    }
}
