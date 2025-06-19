package Java_Learning.Queues.PracQues;

//Maximum of all subarrays of size k

import java.util.Deque;
import java.util.LinkedList;

public class Prac6 {
    public static void max_in_subArray(int arr[], int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove elements out of this window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove all smaller elements (they won't be max)
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Start printing only when we have the first full window
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;

        max_in_subArray(arr, k);
    }
}
