import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionExample {

    public static void main(String[] args) {
        Number value;

        // Tries to convert the string into a number
        try {
            value = NumberFormat.getInstance().parse("1.75");
            System.out.println("Converted value: " + value);

        } catch (ParseException e) {
            // Catches the exception and displays a friendly message

            System.out.println("Error: The string isn't in a valid numeric format. ");
            System.out.println("Error details: " + e.getMessage());
        }
    }
}