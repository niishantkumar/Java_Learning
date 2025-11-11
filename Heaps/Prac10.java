package Java_Learning.Heaps;

import java.util.PriorityQueue;

// Sliding Window Maximum using Max Heap (PriorityQueue)
// Time Complexity: O(n log k)

public class Prac10 {

    // Pair class to store value and its index in the array
    static class Pair implements Comparable<Pair> {
        int val; // the value from the array
        int idx; // index of this value in the array

        // Constructor
        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        // Define comparison logic for the PriorityQueue
        // We reverse the usual comparison so the queue acts as a MAX-HEAP
        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val; // larger val gets higher priority
        }
    }

    public static void main(String[] args) {

        // Input array
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };

        // Size of the sliding window
        int k = 3;

        // Result array to store max of each window
        int result[] = new int[arr.length - k + 1];

        // PriorityQueue to store (value, index) pairs in descending order of value
        PriorityQueue<Pair> max = new PriorityQueue<>();

        // ---------- Step 1: Process the first window ----------
        for (int i = 0; i < k; i++) {
            max.add(new Pair(arr[i], i)); // insert first k elements
        }

        // The top element (peek) of the max heap is the maximum of the first window
        result[0] = max.peek().val;

        // ---------- Step 2: Process the remaining elements ----------
        for (int i = k; i < arr.length; i++) {

            // Remove elements that are outside the current window
            // If the top element's index <= i - k, it means it’s no longer part of this
            // window
            while (max.size() > 0 && max.peek().idx <= i - k) {
                max.remove(); // remove it from heap
            }

            // Add the new element (entering the current window)
            max.add(new Pair(arr[i], i));

            // The current maximum is always at the top of the heap
            result[i - k + 1] = max.peek().val;
        }

        // ---------- Step 3: Print all window maximums ----------
        System.out.print("Sliding Window Maximums: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
