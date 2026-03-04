import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // =========================
        // UC1 - Application Entry
        // =========================
        System.out.println("Palindrome Checker Application Started");


        // =========================
        // UC2 - Hardcoded Palindrome
        // =========================
        String input2 = "madam";
        boolean isPalindrome2 = true;

        for (int i = 0; i < input2.length() / 2; i++) {
            if (input2.charAt(i) != input2.charAt(input2.length() - 1 - i)) {
                isPalindrome2 = false;
                break;
            }
        }

        System.out.println("\nUC2 Input: " + input2);
        System.out.println("UC2 Is Palindrome? : " + isPalindrome2);


        // =========================
        // UC3 - Reverse String Method
        // =========================
        String input3 = "level";
        String reversed = "";

        for (int i = input3.length() - 1; i >= 0; i--) {
            reversed += input3.charAt(i);
        }

        boolean isPalindrome3 = input3.equals(reversed);

        System.out.println("\nUC3 Input: " + input3);
        System.out.println("UC3 Reversed: " + reversed);
        System.out.println("UC3 Is Palindrome? : " + isPalindrome3);


        // =========================
        // UC4 - Character Array Method
        // =========================
        String input4 = "radar";

        char[] chars = input4.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome4 = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome4 = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("\nUC4 Input: " + input4);
        System.out.println("UC4 Is Palindrome? : " + isPalindrome4);


        // =========================
        // UC5 - Stack Based Palindrome
        // =========================
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

        System.out.println("\nUC5 Input: " + input5);
        System.out.println("UC5 Is Palindrome? : " + isPalindrome5);


        // =========================
        // UC6 - Queue + Stack Method
        // =========================
        String input6 = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack6 = new Stack<>();

        for (char c : input6.toCharArray()) {
            queue.add(c);
            stack6.push(c);
        }

        boolean isPalindrome6 = true;

        while (!queue.isEmpty()) {

            if (queue.remove() != stack6.pop()) {
                isPalindrome6 = false;
                break;
            }

        }

        System.out.println("\nUC6 Input: " + input6);
        System.out.println("UC6 Is Palindrome? : " + isPalindrome6);

    }
}