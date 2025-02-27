/* ### **Exercise 3: Leap Year Checker**

Write a program that takes a year as input and determines whether it is a leap year. A leap year is:

- Divisible by 4, but not by 100, unless it is also divisible by 400. */

import java.util.Scanner; // IMPORT THE SCANNER CLASS

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // CREATE A SCANNER OBJECT
        int year = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a year: ");

            // CHECK IF THE INPUT IS AN INTEGER
            if (scanner.hasNextInt()) {
                year = scanner.nextInt(); // Read the integer input
                validInput = true; // Exit the loop
            } else {
                System.out.println("Invalid input! Please enter a valid year.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        // CHECK IF IT'S A LEAP YEAR
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }

        scanner.close(); // CLOSE SCANNER

    }
}
