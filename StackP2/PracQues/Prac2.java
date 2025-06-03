package Java_Learning.StackP2.PracQues;

import java.util.Stack;

/*
    Decode a string
    We have an encoded string and the task is to decode it.The pattern in which the string are encoded is as follows.
    
    Sample Input 1: 2[cv]
    Sample Output 1: cvcv
    
    Sample Input 2: 3[b2[v]]
    Sample Output 2: bvvbvvbvv
 */

public class Prac2 {
    // func to decode String
    public static String decodeString(String str) {
        Stack<Character> stk = new Stack<>();
        String temp;
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ']') {
                temp = "";
                while (!stk.isEmpty() && stk.peek() != '[') {
                    temp += stk.pop();
                }
                newStr = temp + newStr;
                if (!stk.isEmpty() && stk.peek() == '[') {
                    stk.pop();
                }

                if (!stk.isEmpty() && Character.isDigit(stk.peek())) {

                    int n = Character.getNumericValue(stk.pop());

                    newStr = newStr.repeat(n);
                }
            } else {
                stk.push(str.charAt(i));
            }

        }

        return newStr;
    }

    // main func
    public static void main(String[] args) {
        String str = "3[b2[v]]";

        System.out.println(decodeString(str));
    }

}