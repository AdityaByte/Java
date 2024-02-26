// If Else statement in Java

// Note - It goes on the second condition when the first one is false
/*** 
 * if - true dont goes to else if or else
 * if - false -> else if - true dont go to else
 * if - false -> else if - false -> else
 ***/

public class IfElseStatement {
    public static void main(String[] args) {
        
        String name = "AdityaByte";
        String name1 = new String("AdityaByte");
        
        if (name == name1){
            System.out.println("Both are same");
        }
        else if( name.equals(name1)){
            System.out.println(" Yeah ! both are equal");
        }
        else {
            System.out.println("Nope they don't");
        }
        
    }
}
