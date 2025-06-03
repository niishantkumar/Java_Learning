package Java_Learning.StackP2.PracQues;

import java.util.Stack;

//decoding String problem

class Solution {
    static String decode(String str) {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();

        String temp = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // Step 1: If digit, calculate the full number (can be multi-digit)
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--; // Adjust because for-loop will also increment
                integerstack.push(count);
            }

            // Step 2: If closing bracket, decode the current pattern
            else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                if (!integerstack.isEmpty()) {
                    count = integerstack.pop();
                }

                while (!stringstack.isEmpty() && stringstack.peek() != '[') {
                    temp = stringstack.pop() + temp;
                }

                if (!stringstack.isEmpty() && stringstack.peek() == '[') {
                    stringstack.pop(); // Remove the opening bracket
                }

                // Repeat temp `count` times and push back to stringstack
                result = "";
                for (int j = 0; j < count; j++) {
                    result += temp;
                }

                for (int j = 0; j < result.length(); j++) {
                    stringstack.push(result.charAt(j));
                }
            }

            // Step 3: If opening bracket
            else if (str.charAt(i) == '[') {
                if (i > 0 && Character.isDigit(str.charAt(i - 1))) {
                    stringstack.push(str.charAt(i)); // Bracket after number
                } else {
                    // Bracket without number means repeat once
                    stringstack.push(str.charAt(i));
                    integerstack.push(1);
                }
            }

            // Step 4: If character, just push it to the stringstack
            else {
                stringstack.push(str.charAt(i));
            }
        }

        // Step 5: Build final result from the stack
        result = "";
        while (!stringstack.isEmpty()) {
            result = stringstack.pop() + result;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str)); // Output: bcacabcacabcaca
    }
}
