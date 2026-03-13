public class Level1_Programs {

    public static void main(String[] args) {

        // Program 1: Find Age
        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println(name + "'s age is " + age);

        // Program 2: Average of PCM marks
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Average PCM mark is " + average);

        // Program 3: Convert Kilometers to Miles
        double kilometers = 10.8;
        double miles = kilometers / 1.6;

        System.out.println("Distance in miles: " + miles);
    }
}