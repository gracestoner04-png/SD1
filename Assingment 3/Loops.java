//begining with import a scanner 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //assigning a name to my scanner so it can be used 
    Scanner sc = new Scanner(System.in);
    //asking the user to input a string we can work with
    System.out.println("Please enter a one word answer for you absolute favorite food!");
    //assigning string to the user input
    String food = sc.nextLine();

    //looping the string, "i++" picking out one character at a time 
    for (int i = 0; i < food.length(); i++) { 
            System.out.println(food.charAt(i)); // printing out a character at a time, starting on a new line each time because of "println"
        }

    }
}
//doing the debug assignment right before this was very helpful for figuring out how to get not only the string to separate but also print on new lines
//this was very similar to the way that I went about problem 3 on the debug assingment, first having to break a part the string with the first part of the for statement
//this was something that was totally new to me, but luckily not new to google! I went to stack overflow to figure out how this has been done in the past and went off of that with my own strings
