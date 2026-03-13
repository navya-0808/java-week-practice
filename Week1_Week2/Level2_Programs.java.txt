import java.util.Scanner;

public class Level2_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Program 1: Area of Triangle
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();

        double areaOfTriangle = 0.5 * base * height;

        System.out.println("Area of Triangle = " + areaOfTriangle);

        // Program 2: Side of Square from Perimeter
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double sideOfSquare = perimeter / 4;

        System.out.println("Side of Square = " + sideOfSquare);

        input.close();
    }
}