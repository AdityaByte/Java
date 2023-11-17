// EXERCISE - 1

// Percentage calculator 


import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the marks of the student - ( for pcm students )");

        // English marks
        System.out.print("English - ");
        float english = scanner.nextFloat();

        // Hindi marks
        System.out.print("Hindi - ");
        float hindi = scanner.nextFloat();

        // Mathematics marks
        System.out.print("Mathematics - ");
        float maths = scanner.nextFloat();

        // Physics marks
        System.out.print("Physics - ");
        float physics = scanner.nextFloat();

        // Chemistry marks
        System.out.print("Chemistry - ");
        float chemistry = scanner.nextFloat();

        float sum = english + hindi + maths + physics + chemistry;
        float percentage = sum / 5;

        if (english > 100) {
            System.out.println(" please enter correct english marks");
        }
        else if (hindi > 100) {
            System.out.println(" please enter correct hindi marks");
        }
        else if (maths > 100){
            System.out.println(" please enter correct maths marks");
        }
        else if (physics > 100) {
            System.out.println(" please enter correct physics marks");
        }
        else if (chemistry > 100){
            System.out.println(" please enter correct chemistry marks");
        }
        else{
            System.out.println("Your percentage is - " + percentage);
        }

        // Instead of this upper code u can also write these or statment

        if (english>100 || hindi>100 || maths>100 || physics>100 || chemistry>100){
            System.out.println("Please enter correct data");
        }
        else{
            System.out.println("Your percentage is - " + percentage);

            
        }

    }
}
