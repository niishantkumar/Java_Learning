package Java_Learning.Queues;

import java.util.Deque;
import java.util.LinkedList;

//implementing Stack using Deque

public class Prac12 {
    static class Stack {
        static Deque<Integer> d = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty() {
            return d.isEmpty();
        }

        // push
        public static void push(int data) {
            d.addLast(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack empty");
                return -1;
            }

            return d.removeLast();
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack empty");
                return -1;
            }

            return d.getLast();
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        while (!stk.isEmpty()) {
            System.out.print(stk.peek() + " ");
            stk.pop();
        }
    }

}