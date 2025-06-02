package Java_Learning.StackP2;

import java.util.Stack;

//duplicate parentheses problem

public class Prac2 {

    public static boolean isDuplicate(String s) {
        Stack<Character> stk = new Stack<>();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;

                while (stk.peek() != '(') {
                    stk.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // duplicate
                } else {
                    stk.pop(); // opening pair
                }
            } else {
                // opening
                stk.push(ch);
            }

        }

        return false;
    }

    public static void main(String[] args) {
        String s = "((a+b))";
        String s1 = "(c+d)";

        if (isDuplicate(s)) {
            System.out.println("Duplicate");
        } else {
            System.out.println("Not duplicate");
        }

        if (isDuplicate(s1)) {
            System.out.println("Duplicate");
        } else {
            System.out.println("Not duplicate");
        }

    }
}