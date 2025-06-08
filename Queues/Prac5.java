package Java_Learning.Queues;

//Queue using two stacks

import java.util.Stack;

public class Prac5 {
    static class Queue {
        static Stack<Integer> stk1 = new Stack<>();
        static Stack<Integer> stk2 = new Stack<>();

        public static boolean isEmpty() {
            return stk1.isEmpty();
        }

        // add
        public static void add(int data) {
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }

            stk1.add(data);

            while (!stk2.isEmpty()) {
                stk1.push(stk2.pop());
            }
        }

        // remove
        public static int remove() {
            if (stk1.isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            return stk1.pop();
        }

        // peek
        public static int peek() {
            if (stk1.isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }

            return stk1.peek();
        }

    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q1 = new Queue();

        q1.add(1);
        q1.add(2);
        q1.add(3);

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }

}