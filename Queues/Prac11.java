package Java_Learning.Queues;

//implementing Deque using JCF

import java.util.Deque;
import java.util.LinkedList;

public class Prac11 {

    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();

        q.add(1);
        q.addFirst(2);
        q.addFirst(3);
        q.addLast(4);

        for (Integer i : q) {
            System.out.print(i + " ");
        }
        System.out.println();

        q.remove();
        q.removeFirst();
        q.removeLast();

        for (Integer i : q) {
            System.out.print(i + " ");
        }
    }

}