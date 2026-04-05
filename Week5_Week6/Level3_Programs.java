import java.util.Scanner;

public class Level3_Programs {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter number of rows for the matrix: ");

        if (!input.hasNextInt()) {
            System.err.println("Error: Number of rows must be an integer.");
            input.close();
            System.exit(1);
        }

        int numberOfRows = input.nextInt();

        // Ask user for number of columns
        System.out.print("Enter number of columns for the matrix: ");

        if (!input.hasNextInt()) {
            System.err.println("Error: Number of columns must be an integer.");
            input.close();
            System.exit(1);
        }

        int numberOfColumns = input.nextInt();

        // Validate rows and columns
        if (numberOfRows <= 0 || numberOfColumns <= 0) {
            System.err.println("Error: Rows and columns must be greater than 0.");
            input.close();
            System.exit(1);
        }

        // Create 2D array (matrix)
        int[][] matrix = new int[numberOfRows][numberOfColumns];

        // Take matrix input from user
        System.out.println("Enter " + (numberOfRows * numberOfColumns) + " integer values for the matrix:");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (!input.hasNextInt()) {
                    System.err.println("Error: Invalid input. Please enter only integers.");
                    input.close();
                    System.exit(1);
                }
                matrix[row][column] = input.nextInt();
            }
        }

        // Display matrix
        System.out.println("\nMatrix elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        // Display size details
        int totalRows = matrix.length;
        int totalColumns = matrix[0].length;
        int totalElements = totalRows * totalColumns;

        System.out.println("\nMatrix Details:");
        System.out.println("Number of rows = " + totalRows);
        System.out.println("Number of columns = " + totalColumns);
        System.out.println("Total number of elements = " + totalElements);

        // Access a specific element
        System.out.println("\nFirst element of the matrix = " + matrix[0][0]);
        System.out.println("Last element of the matrix = " + matrix[totalRows - 1][totalColumns - 1]);

        // Close scanner
        input.close();
    }
}