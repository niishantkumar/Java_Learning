package Java_Learning.Queues;

//Interleave two halves of a Queue

import java.util.Queue;
import java.util.LinkedList;

public class Prac9 {
    // func to print Interleave
    public static void printInterleave(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Queue needs to have even number of elements");
            return;
        }

        Queue<Integer> firstHalf = new LinkedList<>();

        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

        // loop to print
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }

    // main func
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);

        printInterleave(q1);
    }
}