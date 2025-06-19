package Java_Learning.Queues.PracQues;

import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

/*
 ********Maximum of all subarrays of size k********
 
 We have an array arr[] of size N and an integer K. Find the maximum for each and every
 contiguous subarray of size K.
 Sample Input 1 : N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
 Sample Output 1 : 3 3 4 5 5 5 6
 */

public class Prac5 {
    // max of each contiguous aarray
    public static void max_in_subArray(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            q.add(arr[i]);
        }
        System.out.print(Collections.max(q) + " ");

        for (int i = k; i < arr.length; i++) {
            q.remove();
            q.add(arr[i]);
            System.out.print(Collections.max(q) + " ");

        }

    }

    // main func
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };

        int k = 3;

        max_in_subArray(arr, k);

    }
}