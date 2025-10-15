import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        String message = "Hello, this is a sample message!";
        int charLimit = 20;

        // Function to get length of a string
        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(message);
        System.out.println("Message length: " + length);

        if (length > charLimit) {
            System.out.println("Warning! Message exceeds the character limit of " + charLimit);
        } else {
            System.out.println("Message is within the limit.");
        }
    }
}
