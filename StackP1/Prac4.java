package Java_Learning.StackP1;

//push at the bottom of the stack

import java.util.Stack;

public class Prac4 {

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

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtBottom(s, 0);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }

}