import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you enter your favorite number...I will return what that number to the 3rd power is...");
        int num = sc.nextInt();  
        print3rd(num);
    }

    public static void print3rd(int x) {
        int cube = x * x * x;
        System.out.println("Your number to the 3rd power is: " + cube);
    }
}
