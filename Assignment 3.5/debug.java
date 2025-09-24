//begin with importing a scanner for future use
import java.util.Scanner;
class Debug {
    public static void main(String[] args) {
        //assigning name to scanner
        Scanner sc = new Scanner(System.in);
        //ask user for input of their yearly salary
        System.out.println("Enter your yearly salary");
        //assigning variable to salary using scanner to use later in the program
        int salary = sc.nextInt();
        //asking user for their next input, what their yearly expenses are 
        System.out.println("Enter your yearly expenses");
        //creating new variable to store input for yearly expenses
        int expenses = sc.nextInt();
        //getting last part of input from user, amount of people
        System.out.println("Enter the amount of people in your household");
        //storing variable
        int people = sc.nextInt();

        //creating a for loop to calcuate additional tax reduction using the inputs and variables that came from user responses 
        //starting at zero as a base, tax reduction increases by 2 for every person in the household
        int additionalTaxReduction = 0;
        for(int i = 0; i <= people; i++){
            additionalTaxReduction += 2;
        }

        //creating if statements to determine percentage of tax reduction each household should expect
        int taxReduction = 0;
        taxReduction += additionalTaxReduction;
        //when the salary is greater than 5000 and the household is greater than 3, there is 10 percent added to the additional tax reduction that was already calulated
        //percentage then printed to the user
        if(salary > 50000 && people > 3){
            taxReduction += 10;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        //when salary greater than 3000 and household size greater than 4, there is 9 percent added to the additional tax reduction, and printed
        } else if(salary > 30000 && people > 4){
            taxReduction += 9;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        //salary greater than 7000 and people greater than 2, 5 percent added and printed
        } else if(salary > 70000 && people > 2){
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        //when the salary is less than 7000 and the household size is less than 2, there is no tax reduction to be applied and this is printed to the user
        } else {
            System.out.println("No applicable reduction on taxes found.");
        }

    }
}

//I tried to insert a comment on most lines, then if someone else is using my code - they can read my english writing rather than having to go through and understand the code itself
//Also, if someone else were debugging my code, they would know what it is I was trying to get to work rather than having to guess what was supposed to execute on each line
//For myself - I like to make a habit of commenting things like importing and assigning scanner, this just helps me remember the basic steps that we are doing over and over again
