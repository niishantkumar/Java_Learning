package Java_Learning.StackP1;

import java.util.Stack;

//tc : O(n)
//sc : O(n)

public class Prac6 {

    // Function to reverse stack in O(N) time and O(1) space
    public static void reverse(Stack<Integer> stk) {
        if (stk.isEmpty())
            return;

        // Convert stack to array for swapping
        int size = stk.size();
        Integer[] arr = new Integer[size];

        // Pop all elements into array
        for (int i = 0; i < size; i++) {
            arr[i] = stk.pop();
        }

        // Push back in reverse order
        for (int i = 0; i < size; i++) {
            stk.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(0);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        System.out.println("Original Stack:");
        System.out.println(stk);

        reverse(stk);

        System.out.println("Reversed Stack:");
        System.out.println(stk);
    }
}
