// Program - for checking the given number is a prime number or not

public class PrimeNoChecking {

    public boolean checkingPrimeNumber(int a){
        if(a <= 0){
            return false;
        }
        else{
           for(int i=2; i<a; i++){
               if(a%i == 0){
                   return true;
               }
           }
        }
        return false;
    }

    public static void main(String[] args) {
        Test obj = new Test();
        boolean b1 = obj.checkingPrimeNumber(2);

        if(!b1){
            System.out.println("Yes it is a prime number");
        }
        else {
            System.out.println("No its not a prime number");
        }
    }
}
