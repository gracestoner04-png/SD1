import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main(String[] args){
 
ArrayList<String> goodGPA = new ArrayList<String>(); // begining with an empy list to add names to with gpa's over 3.5 
int totalNames = 0; //starting out with zero names in the list
 File inputfile = new File("practice.txt"); //choosing file to read from 
 try {
 Scanner input = new Scanner(inputfile);
while (input.hasNextLine()) {

    String Name = input.nextLine();  //grabbing the names of the students

    if (!input.hasNextDouble()) break; 
    double studentGPA = input.nextDouble(); //grabs the value of the gpa

    //will only run this next line if there is another name, loop will stop at the end of the file
    if (input.hasNextLine()) {
        input.nextLine();
    }

    totalNames++; //loops to the next line 

    if (studentGPA > 3.5) {
        goodGPA.add(Name); //if the double that was pulled from the file is greater than 3.5, the name associated with the gpa will be added to list created at the begining
    }
}
 } catch (FileNotFoundException e) {
 throw new RuntimeException(e);
 }

 //printing out the names with 3.5+ GPAS then printing out the count of how many names are in said list along with how many names there were total 
System.out.println("Names with GPA > 3.5: " + goodGPA);
System.out.println("Number of names with GPA > 3.5: " + goodGPA.size());
System.out.println("Total number of names: " + totalNames);
 }
}

//The biggest learning curve that I ran into doing this assignment was what to do when I got to the end of the list. I was getting a lot of errors when it would try to call nextLine and there was no next line
//I am getting more comfortable with trouble shooting and reading what errors are poping up in the terminal
