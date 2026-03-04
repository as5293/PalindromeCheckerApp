import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC5 - Stack Based Palindrome

        String input5 = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input5.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome5 = true;

        for (char c : input5.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome5 = false;
                break;
            }
        }

        System.out.println("UC5 Input: " + input5);
        System.out.println("UC5 Is Palindrome? : " + isPalindrome5);

    }
}