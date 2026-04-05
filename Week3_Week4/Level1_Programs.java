import java.util.Scanner;

public class Level1_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Program 1: Check divisibility by 5
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Is divisible by 5? " + (number % 5 == 0));

        // Program 2: Check if first number is the smallest
        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("Is first number the smallest? " + (a < b && a < c));

        // Program 3: Check which number is the largest
        System.out.println("Is first number the largest? " + (a > b && a > c));
        System.out.println("Is second number the largest? " + (b > a && b > c));
        System.out.println("Is third number the largest? " + (c > a && c > b));

        // Program 4: Sum of first n natural numbers
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers = " + sum);
        } else {
            System.out.println("Invalid input. Please enter a natural number.");
        }

        input.close();
    }
}