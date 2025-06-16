package Java_Learning.Queues.PracQues;

import java.util.PriorityQueue;

/*
 ************Connect n ropes with minimum cost**************

 Given are N ropes of different lengths, the task is to connect these ropes into one rope with
 minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.

 Sample Input 1 : N = 4, arr = [4 3 2 6]
 Sample Output 1 : 29
 
 Sample Input 2 : N = 2, arr = [1 2 3]
 Sample Output 2 : 9
 */

public class Prac2 {
    // func to get minimum cost
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int minCost = 0;
        int cost1;
        int cost2;
        int currCost;

        while (pq.size() > 1) {
            cost1 = pq.poll();
            cost2 = pq.poll();

            currCost = cost1 + cost2;

            pq.add(currCost);

            minCost += currCost;

        }

        return minCost;
    }

    // main func
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };

        System.out.println(minCost(arr));
    }

}