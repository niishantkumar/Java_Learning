package Java_Learning.StackP1;

//reverse a Stack
//tc : O(n^2)
//sc : O(n)

import java.util.Stack;

public class Prac7 {

    // func to push at the bottom
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // func reverse Stack
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack :");
        System.out.println(s);
        System.out.println();

        reverseStack(s);
        System.out.println("Reversed Stack :");
        System.out.println(s);

    }

}