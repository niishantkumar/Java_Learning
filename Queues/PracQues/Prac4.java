package Java_Learning.Queues.PracQues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 *********Reversing the first K elements of a Queue************

 We have an integer k and a queue of integers, we need to reverse the order of the first k
 elements of the queue, leaving the other elements in the same relative order.
 Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
 Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
 */

public class Prac4 {
    // func to reverse kth part of queue
    public static void reverse_q_kPart(Queue<Integer> q, int k) {
        Stack<Integer> stk = new Stack<>();

        // push kPart of q in stk
        for (int i = 0; i < k; i++) {
            stk.push(q.remove());
        }

        // add reversed part back to q
        for (int i = 0; i < k; i++) {
            q.add(stk.pop());
        }

        // removing unreversed part from front and adding to back
        for (int i = k; i < q.size(); i++) {
            q.add(q.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int k = 5;

        System.out.println("Before :");
        for (Integer i : q) {
            System.out.print(i + " ");
        }

        reverse_q_kPart(q, k);

        System.out.println("\nAfter :");
        for (Integer i : q) {
            System.out.print(i + " ");
        }
    }
}