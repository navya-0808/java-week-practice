import java.util.Scanner;

public class Level2_Programs {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the size of the array: ");

        // Validate array size
        if (!input.hasNextInt()) {
            System.err.println("Error: Array size must be an integer.");
            input.close();
            System.exit(1);
        }

        int arraySize = input.nextInt();

        // Check valid size
        if (arraySize <= 0) {
            System.err.println("Error: Array size must be greater than 0.");
            input.close();
            System.exit(1);
        }

        // Create array
        int[] numbers = new int[arraySize];

        // Take array input
        System.out.println("Enter " + arraySize + " integer values:");

        for (int index = 0; index < numbers.length; index++) {
            if (!input.hasNextInt()) {
                System.err.println("Error: Invalid input. Please enter only integers.");
                input.close();
                System.exit(1);
            }
            numbers[index] = input.nextInt();
        }

        // Initialize variables for calculations
        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

        // Traverse array to calculate sum, largest, smallest
        for (int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index];

            if (numbers[index] > largest) {
                largest = numbers[index];
            }

            if (numbers[index] < smallest) {
                smallest = numbers[index];
            }
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Display array elements
        System.out.println("\nArray elements:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Element at index " + index + " = " + numbers[index]);
        }

        // Display results
        System.out.println("\nSum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);
        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);

        // Close scanner
        input.close();
    }
}