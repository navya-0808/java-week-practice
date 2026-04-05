import java.util.Scanner;

public class Level2_Programs {

    // Recursive method to find factorial
    public static long findFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * findFactorial(number - 1);
    }

    // Static method to display Math class operations
    public static void displayMathOperations(double firstValue, double secondValue) {
        double maximumValue = Math.max(firstValue, secondValue);
        double minimumValue = Math.min(firstValue, secondValue);
        double powerValue = Math.pow(firstValue, secondValue);
        double squareRootValue = Math.sqrt(firstValue);
        double roundedValue = Math.round(firstValue);

        System.out.println("\nMath Class Results:");
        System.out.println("Maximum value = " + maximumValue);
        System.out.println("Minimum value = " + minimumValue);
        System.out.println(firstValue + " raised to power " + secondValue + " = " + powerValue);
        System.out.println("Square root of " + firstValue + " = " + squareRootValue);
        System.out.println("Rounded value of " + firstValue + " = " + roundedValue);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for factorial
        System.out.print("Enter a non-negative integer for factorial: ");
        if (!input.hasNextInt()) {
            System.err.println("Error: Value must be an integer.");
            input.close();
            System.exit(1);
        }

        int factorialNumber = input.nextInt();

        if (factorialNumber < 0) {
            System.err.println("Error: Factorial is not defined for negative numbers.");
            input.close();
            System.exit(1);
        }

        // Call recursive factorial method
        long factorialResult = findFactorial(factorialNumber);
        System.out.println("Factorial of " + factorialNumber + " = " + factorialResult);

        // Take input for Math operations
        System.out.print("\nEnter first decimal number: ");
        if (!input.hasNextDouble()) {
            System.err.println("Error: First decimal value must be a number.");
            input.close();
            System.exit(1);
        }
        double firstValue = input.nextDouble();

        System.out.print("Enter second decimal number: ");
        if (!input.hasNextDouble()) {
            System.err.println("Error: Second decimal value must be a number.");
            input.close();
            System.exit(1);
        }
        double secondValue = input.nextDouble();

        // Call method to use Math class methods
        displayMathOperations(firstValue, secondValue);

        // Java Standard Library Methods example
        String sampleText = "Java Programming";
        int textLength = sampleText.length();
        String upperCaseText = sampleText.toUpperCase();

        System.out.println("\nJava Standard Library Method Results:");
        System.out.println("Original text = " + sampleText);
        System.out.println("Length of text = " + textLength);
        System.out.println("Uppercase text = " + upperCaseText);

        // Close scanner
        input.close();
    }
}