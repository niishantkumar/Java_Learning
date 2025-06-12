package Java_Learning.Queues;

//reverse a Queue

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Prac10 {
    // func to reverse given Queue
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> stk = new Stack<>();

        while (!q.isEmpty()) {
            stk.push(q.remove());
        }

        while (!stk.isEmpty()) {
            q.add(stk.pop());
        }
    }

    // main func
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        for (Integer i : q) {
            System.out.print(i + " ");
        }
    }
}
