package Java_Learning.Queues;

//Stack using 2 Ques

import java.util.LinkedList;
import java.util.Queue;

public class Prac6 {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty();
        }

        // add
        public static void push(int data) {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            q1.add(data);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // remove
        public static int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack empty");
                return -1;
            }
            return q1.remove();
        }

        // peek
        public static int peek() {
            if (q1.isEmpty()) {
                System.out.println("Stack empty");
                return -1;
            }

            return q1.peek();
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
            System.out.println(stk.pop());
        }

    }
}