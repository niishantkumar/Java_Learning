package Java_Learning.StackP2;

//valid parentheses problem

import java.util.Stack;

public class Prac1 {

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else {
                if (stk.isEmpty()) {
                    return false;
                }
                if ((stk.peek() == '(' && ch == ')')
                        || (stk.peek() == '{' && ch == '}')
                        || (stk.peek() == '[' && ch == ']')) {

                    stk.pop();
                } else {
                    return false;
                }
            }
        }

        if (stk.isEmpty()) {
            return true;
        }
        return false; // if any opening bracket left

    }

    public static void main(String[] args) {
        String s = "({([])[]})";

        if (isValid(s)) {
            System.out.println("Valid parenrheses");
        } else {
            System.out.println("Invalid parentheses");
        }

    }
}
