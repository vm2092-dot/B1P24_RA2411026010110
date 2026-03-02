import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    // UC1 - Application Entry
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("      Palindrome Checker App     ");
        System.out.println("      Version 1.0                ");
        System.out.println("=================================\n");

        uc2HardcodedCheck();

        uc3ReverseString("racecar");

        uc4CharArrayCheck("level");

        uc5StackCheck("madam");

        uc6QueueStackCheck("radar");

        uc7DequeCheck("civic");
    }

    // UC2 - Hardcoded String Check
    public static void uc2HardcodedCheck() {
        System.out.println("UC2 - Hardcoded Palindrome Check");

        String word = "madam";

        if (word.equals("madam")) {
            System.out.println(word + " is a Palindrome\n");
        } else {
            System.out.println(word + " is NOT a Palindrome\n");
        }
    }

    // UC3 - Reverse String Using Loop
    public static void uc3ReverseString(String input) {
        System.out.println("UC3 - Reverse String Method");

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome\n");
        } else {
            System.out.println(input + " is NOT a Palindrome\n");
        }
    }

    // UC4 - Character Array (Two Pointer)
    public static void uc4CharArrayCheck(String input) {
        System.out.println("UC4 - Character Array Check");

        char[] arr = input.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome\n");
        } else {
            System.out.println(input + " is NOT a Palindrome\n");
        }
    }

    // UC5 - Stack Based Check
    public static void uc5StackCheck(String input) {
        System.out.println("UC5 - Stack Based Check");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome\n");
        } else {
            System.out.println(input + " is NOT a Palindrome\n");
        }
    }

    // UC6 - Queue + Stack Check
    public static void uc6QueueStackCheck(String input) {
        System.out.println("UC6 - Queue + Stack Check");

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome\n");
        } else {
            System.out.println(input + " is NOT a Palindrome\n");
        }
    }

    // UC7 - Deque Based Optimized Check
    public static void uc7DequeCheck(String input) {
        System.out.println("UC7 - Deque Based Optimized Check");

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome\n");
        } else {
            System.out.println(input + " is NOT a Palindrome\n");
        }
    }
}