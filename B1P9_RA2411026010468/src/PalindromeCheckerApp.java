/**
 * =========================================================
 * MAIN CLASS – PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates palindrome validation
 * using a hardcoded string value.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = true;

        // Check palindrome
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}