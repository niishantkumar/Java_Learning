package Java_Learning.StackP1;

// Reverse a String using Stack

import java.util.Stack;

public class Prac5 {
    // Function to reverse a String
    public static String reverse(String str) {
        Stack<Character> stk = new Stack<>();

        for (char ch : str.toCharArray()) {
            stk.push(ch);
        }

        // Build reversed string by popping from stack
        StringBuilder newStr = new StringBuilder();
        while (!stk.isEmpty()) {
            newStr.append(stk.pop());
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String s = "Hello World";

        s = reverse(s); // Update s with reversed string

        System.out.println(s);
    }
}
