import java.util.Scanner;

public class Level1_Programs {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the size of the array: ");

        // Validate array size input
        if (!input.hasNextInt()) {
            System.err.println("Error: Array size must be an integer.");
            input.close();
            System.exit(1);
        }

        int arraySize = input.nextInt();

        // Check if array size is valid
        if (arraySize <= 0) {
            System.err.println("Error: Array size must be greater than 0.");
            input.close();
            System.exit(1);
        }

        // Create array
        int[] numbers = new int[arraySize];

        // Take user input for array elements
        System.out.println("Enter " + arraySize + " integer values:");

        for (int index = 0; index < numbers.length; index++) {
            if (!input.hasNextInt()) {
                System.err.println("Error: Invalid input. Please enter only integers.");
                input.close();
                System.exit(1);
            }
            numbers[index] = input.nextInt();
        }

        // Display first element using direct access
        System.out.println("\nFirst element in the array: " + numbers[0]);

        // Display all elements using for loop and length property
        System.out.println("Array elements using for loop:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Element at index " + index + " = " + numbers[index]);
        }

        // Modify an array element
        System.out.print("\nEnter the index to modify (0 to " + (numbers.length - 1) + "): ");

        if (!input.hasNextInt()) {
            System.err.println("Error: Index must be an integer.");
            input.close();
            System.exit(1);
        }

        int modifyIndex = input.nextInt();

        // Validate index
        if (modifyIndex < 0 || modifyIndex >= numbers.length) {
            System.err.println("Error: Invalid index. Index out of range.");
            input.close();
            System.exit(1);
        }

        // Ask for new value
        System.out.print("Enter the new value: ");

        if (!input.hasNextInt()) {
            System.err.println("Error: New value must be an integer.");
            input.close();
            System.exit(1);
        }

        int newValue = input.nextInt();

        // Modify array element
        numbers[modifyIndex] = newValue;

        // Display updated array
        System.out.println("\nUpdated array elements:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Element at index " + index + " = " + numbers[index]);
        }

        // Close scanner
        input.close();
    }
}