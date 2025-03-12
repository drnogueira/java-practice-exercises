/**
 * Custom exception for invalid postcode formats.
 */
public class InvalidPostcodeException extends Exception {
    // Constructor with a custom error message
    public InvalidPostcodeException(String message) {
        super(message); // Pass the message to the parent class (Exception)
    }
}