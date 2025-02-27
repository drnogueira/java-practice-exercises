// Write a program that takes an integer as input and determines whether it is odd or even. If the number is even, check if it is also divisible by 4. Print the results accordingly.

import java.util.Scanner; // IMPORT THE SCANNER CLASS

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // CREATE A SCANNER OBJECT
        int number = 0;
        boolean validInput = false;

        // Loop until valid input is provided
        while (!validInput) {
            System.out.print("Enter an integer: ");

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt(); // Read the integer input
                validInput = true; // Exit the loop
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        if (number % 2 == 0) {

            if (number % 4 == 0) {
                System.out.println("Even and divisible by 4");
            } else {
                System.out.println("Even");
            }

        } else {
            System.out.println("Odd");
        }

        scanner.close(); // CLOSE SCANNER
    }

}
