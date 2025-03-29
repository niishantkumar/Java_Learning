package Java_Learning.StackP1;

import java.util.ArrayList;

public class Prac1 {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // func to if stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);

            list.remove(list.size() - 1);

            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        // to print stack
        while (!s1.isEmpty()) {
            System.out.print(s1.peek()+" ");
            s1.pop();
        }
    }

}
