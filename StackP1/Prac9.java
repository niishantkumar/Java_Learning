package Java_Learning.StackP1;

import java.util.Stack;

//next greatest element 

public class Prac9 {
    //
    public static void nextGreater(int arr[], int nextGreater[]) {
        Stack<Integer> stk = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.isEmpty() && arr[stk.peek()] <= arr[i]) {
                stk.pop();
            }

            if (stk.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[stk.peek()];
            }

            stk.push(i);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };

        int nextGreater[] = new int[arr.length];

        nextGreater(arr, nextGreater);

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}