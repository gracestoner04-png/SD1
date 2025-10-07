import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number and I will tell you the factorial: ");
        int num = sc.nextInt();
        fact(num);

    Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        String number = sc2.nextLine();
        EveryOther(number);

    Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the name of your town.");
        String town = sc3.nextLine();
        townR(town);
    

    }

    public static void fact(int x) {
        int product = 1;
        for (int i = 1; i <= x; i++) {
            product *= i;
        }
        System.out.println(x + "! = " + product);
    }

    public static void EveryOther(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i += 2) {
            sum += Character.getNumericValue(number.charAt(i));
        }

        System.out.println("The sum of every other digit is: " + sum);
    }

    public static void townR(String town){
        String reverse = new StringBuilder(town).reverse().toString();
        System.out.println("Your town in reverse is " + reverse);
    }
  
}
