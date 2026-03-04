/**
 * ============================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting all characters to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than formatting dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        // Original input string
        String input = "A man a plan a canal Panama";

        // Normalize string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Palindrome check
        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}