package Java_Learning.StackP2.PracQues;

import java.util.Stack;

public class Prac3 {
    public static String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue; // Skip empty and current directory
            } else if (part.equals("..")) {
                if (!stk.isEmpty()) {
                    stk.pop(); // Go up one directory
                }
                // else stay at root
            } else {
                stk.push(part); // Add directory to stack
            }
        }

        // Build simplified path
        if (stk.isEmpty()) {
            return "/";
        }

        StringBuilder simplified = new StringBuilder();
        for (String dir : stk) { // String dir in stk
            simplified.append("/").append(dir);
        }

        return simplified.toString();
    }

    public static void main(String[] args) {
        String str1 = "/apnacollege/";
        String str2 = "/a/..";
        String str3 = "/a/b/../c/.";

        System.out.println(simplifyPath(str1)); // /apnacollege
        System.out.println(simplifyPath(str2)); // /
        System.out.println(simplifyPath(str3)); // /a/c
    }
}
