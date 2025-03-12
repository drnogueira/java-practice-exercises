import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {

    // Constants for messages
    private static final String NAME_PROMPT = "Enter your name: ";
    private static final String SURNAME_PROMPT = "Enter your surname: ";
    private static final String AGE_PROMPT = "Enter your age: ";
    private static final String HEIGHT_PROMPT = "Enter your height: ";
    private static final String INVALID_NAME_MESSAGE = "Name cannot be empty. Please try again.";
    private static final String INVALID_AGE_MESSAGE = "Age must be a valid integer. Please try again.";
    private static final String INVALID_HEIGHT_MESSAGE = "Height must be a valid number. Please try again.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        String name = getNonEmptyInput(scanner, NAME_PROMPT, INVALID_NAME_MESSAGE);
        String surname = getNonEmptyInput(scanner, SURNAME_PROMPT, INVALID_NAME_MESSAGE);
        int age = getValidIntegerInput(scanner, AGE_PROMPT, INVALID_AGE_MESSAGE);
        float height = getValidFloatInput(scanner, HEIGHT_PROMPT, INVALID_HEIGHT_MESSAGE);

        // Capitalize the first letter of the name and surname
        name = capitalizeFirstLetter(name);
        surname = capitalizeFirstLetter(surname);

        // Print user details
        printUserDetails(name, surname, age, height);

        // Close the scanner
        scanner.close();
    }

    // Method to capitalize the first letter of a string
    private static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return the original string if it's null or empty
        }
        // Convert the first letter to uppercase and the rest to lowercase
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    // Method to get a non-empty input from the user
    private static String getNonEmptyInput(Scanner scanner, String prompt, String errorMessage) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println(errorMessage);
        }
    }

    // Method to get a valid integer input from the user
    private static int getValidIntegerInput(Scanner scanner, String prompt, String errorMessage) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.next(); // Clear the scanner buffer
            }
        }
    }

    // Method to get a valid float input from the user
    private static float getValidFloatInput(Scanner scanner, String prompt, String errorMessage) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.next().replace(',', '.'); // Replace ',' with '.'
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    // Method to print user details
    private static void printUserDetails(String name, String surname, int age, float height) {
        System.out.println("Hi, my name is " + name + " " + surname);
        System.out.println("I'm " + age + " years old");
        System.out.printf("My height is %.2f cm%n", height);
    }
}