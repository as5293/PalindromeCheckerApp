/**
 * ============================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * The focus is on algorithm interchangeability.
 *
 * @author Developer
 * @version 12.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC12.
     */
    public static void main(String[] args) {

        String input = "level";

        // Choose the strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected strategy
        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * ============================================================
 * INTERFACE – PalindromeStrategy
 * ============================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */

interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * ============================================================
 * CLASS – StackStrategy
 * ============================================================
 *
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behaviour to reverse characters
 * and compare them with the original sequence.
 */

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}