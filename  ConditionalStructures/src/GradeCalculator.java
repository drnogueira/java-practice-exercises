/* Exercise 1: Grade Calculator
Write a program that takes a student's score (0 to 100) as input and prints their corresponding grade based on the following rules:

90 or above: A

80 to 89: B

70 to 79: C

60 to 69: D

Below 60: F */

import java.util.Scanner; // IMPORT THE SCANNER CLASS

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // CREATE A SCANNER OBJECT
        int score;

        // LOOP UNTIL A VALID SCORE IS ENTERED
        while (true) {
            System.out.print("Enter a student's score (0 to 100):  ");
            score = scanner.nextInt();

            // VALIDATE INPUT
            if (score >= 0 && score <= 100) {
                break; // EXIT THE LOOP IF THE SCORE IS VALID
            } else {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
            }
        }

        // DETERMINE GRADE BASED ON SCORE
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade : " + grade);

        scanner.close(); // CLOSE SCANNER

    }
}
