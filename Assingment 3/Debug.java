import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you the factorial: ");
        int num = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= num; i++){
            product = product * i;
        }
        System.out.println(num + "! = " + product);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        String number = sc2.nextLine();
        int sum = 0;
        for (int i = 0; i < number.length(); i += 2) {
            sum += Character.getNumericValue(number.charAt(i));
        }

        System.out.println("The sum of every other digit is: " + sum);




        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the name of your town.");
        String town = sc3.nextLine();
        String reverse = new StringBuilder(town).reverse().toString();
        System.out.println("Your town in reverse is " + reverse);

    }
}
