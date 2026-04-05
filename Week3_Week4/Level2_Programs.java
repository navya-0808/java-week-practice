import java.util.Scanner;

public class Level2_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Program 1: Odd or Even for numbers from 1 to n
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        // Program 2: Bonus calculation
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No Bonus");
        }

        // Program 3: Multiplication table from 6 to 9
        System.out.print("Enter a number for multiplication table: ");
        int num = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        input.close();
    }
}