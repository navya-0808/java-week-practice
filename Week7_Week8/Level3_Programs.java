import java.util.Scanner;

public class Level3_Programs {

    // Recursive method to find Fibonacci term
    public static int findFibonacci(int termNumber) {
        if (termNumber == 0) {
            return 0;
        }
        if (termNumber == 1) {
            return 1;
        }
        return findFibonacci(termNumber - 1) + findFibonacci(termNumber - 2);
    }

    // Dynamic static method to calculate circle area
    public static double calculateCircleArea(double radius) {
        double piValue = Math.PI;
        double area = piValue * Math.pow(radius, 2);
        return area;
    }

    // Dynamic static method to calculate hypotenuse
    public static double calculateHypotenuse(double sideA, double sideB) {
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return hypotenuse;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take Fibonacci term input
        System.out.print("Enter the number of Fibonacci terms to display: ");
        if (!input.hasNextInt()) {
            System.err.println("Error: Number of terms must be an integer.");
            input.close();
            System.exit(1);
        }

        int totalTerms = input.nextInt();

        if (totalTerms <= 0) {
            System.err.println("Error: Number of terms must be greater than 0.");
            input.close();
            System.exit(1);
        }

        // Display Fibonacci series using recursive method
        System.out.println("\nFibonacci Series:");
        for (int index = 0; index < totalTerms; index++) {
            int fibonacciValue = findFibonacci(index);
            System.out.print(fibonacciValue + " ");
        }
        System.out.println();

        // Take radius input for circle area
        System.out.print("\nEnter radius of circle: ");
        if (!input.hasNextDouble()) {
            System.err.println("Error: Radius must be a number.");
            input.close();
            System.exit(1);
        }

        double radius = input.nextDouble();

        if (radius <= 0) {
            System.err.println("Error: Radius must be greater than 0.");
            input.close();
            System.exit(1);
        }

        // Call method to calculate circle area
        double circleArea = calculateCircleArea(radius);
        System.out.println("Area of circle = " + circleArea);

        // Take triangle sides input
        System.out.print("\nEnter side A of right triangle: ");
        if (!input.hasNextDouble()) {
            System.err.println("Error: Side A must be a number.");
            input.close();
            System.exit(1);
        }
        double sideA = input.nextDouble();

        System.out.print("Enter side B of right triangle: ");
        if (!input.hasNextDouble()) {
            System.err.println("Error: Side B must be a number.");
            input.close();
            System.exit(1);
        }
        double sideB = input.nextDouble();

        if (sideA <= 0 || sideB <= 0) {
            System.err.println("Error: Triangle sides must be greater than 0.");
            input.close();
            System.exit(1);
        }

        // Call method to calculate hypotenuse
        double hypotenuse = calculateHypotenuse(sideA, sideB);
        System.out.println("Hypotenuse of triangle = " + hypotenuse);

        // Close scanner
        input.close();
    }
}