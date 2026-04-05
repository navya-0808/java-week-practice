import java.util.Scanner;

public class Level1_Programs {

    // Static method to add two numbers
    public static int calculateSum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    // Static method to find square of a number
    public static int findSquare(int number) {
        int square = number * number;
        return square;
    }

    // Static method to display multiplication table
    public static void displayMultiplicationTable(int number) {
        int startValue = 1;
        int endValue = 10;

        System.out.println("\nMultiplication Table for " + number + ":");
        for (int count = startValue; count <= endValue; count++) {
            int result = number * count;
            System.out.println(number + " x " + count + " = " + result);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take first number
        System.out.print("Enter first integer: ");
        if (!input.hasNextInt()) {
            System.err.println("Error: First value must be an integer.");
            input.close();
            System.exit(1);
        }
        int firstNumber = input.nextInt();

        // Take second number
        System.out.print("Enter second integer: ");
        if (!input.hasNextInt()) {
            System.err.println("Error: Second value must be an integer.");
            input.close();
            System.exit(1);
        }
        int secondNumber = input.nextInt();

        // Call method to calculate sum
        int sumResult = calculateSum(firstNumber, secondNumber);
        System.out.println("\nSum = " + sumResult);

        // Call method multiple times
        int firstSquare = findSquare(firstNumber);
        int secondSquare = findSquare(secondNumber);

        System.out.println("Square of " + firstNumber + " = " + firstSquare);
        System.out.println("Square of " + secondNumber + " = " + secondSquare);

        // Dynamic method usage
        displayMultiplicationTable(firstNumber);

        // Close scanner
        input.close();
    }
}