// Given an array arr[] of n numbers and another number x, the task is to check whether or not there exist two elements in arr[] whose sum is exactly x. 
// Logic 
/* 
int[] arr = {1,2,3,4);
int x = 3;
for(int i=0; i<arr.length-1; i++){
    for(int j=i+1; j<arr.length; j++){
        if(arr[i] + arr[j] == x){
            return true;
        }
    }
}
*/

class Question6{
    public boolean check(int[] arr , int size , int x){
        for(int i=0; i<size-1 ; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        
        Question6 obj = new Question6();
        int arr[] = new int[]{1,2,3,4};
        int size = arr.length;
        int x = 5;
        boolean result = obj.check(arr , size , x);
        if(result){
            System.out.println("Yes the sum pair exist");
        }
        else{
            System.out.println("No it doesn't exist");
        }
    }
}
