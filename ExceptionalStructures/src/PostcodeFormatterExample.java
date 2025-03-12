public class PostcodeFormatterExample {

    // Constant for the expected length of a valid postcode
    private static final int VALID_POSTCODE_LENGTH = 7;

    public static void main(String[] args) {
        try {
            // Test with a valid postcode
            String formattedPostcode = formatPostcode("4121000");
            System.out.println("Formatted Postcode: " + formattedPostcode);

            // Test with an invalid postcode (incorrect length)
            // String formattedPostcode = formatPostcode("44906");
            // System.out.println("Formatted Postcode: " + formattedPostcode);

            // Test with an invalid postcode (non-numeric characters)
            // String formattedPostcode = formatPostcode("4490a54");
            // System.out.println("Formatted Postcode: " + formattedPostcode);

        } catch (InvalidPostcodeException e) {
            System.out.println("Error: " + e.getMessage()); // Display the error message
        }
    }

    /**
     * Formats the postcode if it is valid.
     *
     * @param postcode The postcode to be formatted.
     * @return The formatted postcode.
     * @throws InvalidPostcodeException If the postcode is invalid.
     */
    static String formatPostcode(String postcode) throws InvalidPostcodeException {
        validatePostcode(postcode); // Validate the postcode before formatting
        return postcode.substring(0, 4) + "-" + postcode.substring(4); // Format the postcode
    }

    /**
     * Validates the postcode.
     *
     * @param postcode The postcode to be validated.
     * @throws InvalidPostcodeException If the postcode is invalid.
     */
    private static void validatePostcode(String postcode) throws InvalidPostcodeException {
        // Check if the postcode contains only digits
        if (!postcode.matches("\\d+")) {
            throw new InvalidPostcodeException("The postcode must contain only digits!");
        }

        // Check if the postcode has the correct length
        if (postcode.length() != VALID_POSTCODE_LENGTH) {
            throw new InvalidPostcodeException(
                    "The postcode must contain exactly " + VALID_POSTCODE_LENGTH + " digits!");
        }
    }
}