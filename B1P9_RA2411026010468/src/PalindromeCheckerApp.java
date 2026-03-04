public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC3 – Palindrome Check Using String Reverse

        String input = "madam";
        String reversed = "";

        // Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Input text: " + input);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Input text: " + input);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Result: Not a Palindrome");
        }
    }
}