package Java_Learning.Heaps;

import java.util.PriorityQueue;

//n ropes problem

public class Prac8 {

    public static void main(String[] args) {
        // given ropes length
        int ropesLen[] = { 3, 2, 4, 6 };

        // adding ropes to priority queue
        PriorityQueue<Integer> ropes = new PriorityQueue<>();
        for (int i = 0; i < ropesLen.length; i++) {
            ropes.add(ropesLen[i]);
        }

        // total cost of connecting ropes
        int cost = 0;

        // loop to connect ropes
        while (ropes.size() > 1) {
            int rope1 = ropes.remove(); // getting smallest ropes from pq
            int rope2 = ropes.remove(); // getting 2nd smallest ropes from pq

            int tempSum = rope1 + rope2; // connecting both ropes

            cost += tempSum; // adding the cost of connection

            ropes.add(tempSum); // adding new rope formed o the pq

        }

        System.out.println("Total cost is : " + cost);
    }
}
