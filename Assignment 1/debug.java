//begin with importing scanner 
import java.util.Scanner;

public class Debug {
    public static void main(String[]args){

        //naming scanner for use
        Scanner sc = new Scanner(System.in);

        //first, prompting the user to imput their age
        System.out.println("How old are you? ");

        //second, assigning string to their age
        String age = sc.nextLine();

        //third, restating the users age back to them
        System.out.println("You are, " + age + " years old! "); 

        //assigning values to num1 and num2
        int num1 = 10;
        int num2 = 37;
        //creating a variable for the sum of the 2 integers
        int sum = num1+num2;

        //printed sentence with the sum of 2 integers
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

 
        //After completing the part of the assingment printing out the sum, I feel more comfortable assigning values to strings and integers
        //My biggest problem throughout this assingment was continuing to forget to add ";" at the end of each line and getting the same error over and over again :(
    }
}
