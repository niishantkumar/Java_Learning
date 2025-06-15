package Java_Learning.Queues;

import java.util.LinkedList;

//Stack using 2 Queues

import java.util.Queue;

public class Prac7 {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // add
        public static void push(int data) {
            if (q1.isEmpty()) {
                q2.add(data);
            } else {
                q1.add(data);
            }
        }

        // remove
        public static int pop() {
            int top = -1;

            if (q2.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        // peek
        public static int peek() {
            int top = -1;
            if (isEmpty()) {
                System.out.println("Stack empty");
                return top;
            }

            if (q2.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    q1.add(top);
                }
            }

            return top;
        }
    }

    // main func
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack stk1 = new Stack();

        stk1.push(1);
        stk1.push(2);
        stk1.push(3);
        stk1.push(4);

        while (!stk1.isEmpty()) {
            System.out.println(stk1.peek());
            stk1.pop();
        }
    }

}