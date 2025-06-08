package Java_Learning.Queues;

import java.util.LinkedList;
import java.util.Queue;

//implementing Queue using JCF

public class Prac4 {

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>(); // Queue is an interface hence we can not create its instance
                                                // also, Queue<Integer> q1 = new ArrayDeque<>();
                                                // diff btw LinkedList and ArrayDeque

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        for (Integer data : q1) {
            System.out.print(data + " ");
        }

        q1.remove();

        System.out.println();
        for (Integer data : q1) {
            System.out.print(data + " ");
        }

    }
}