package Java_Learning.StackP2.PracQues;

import java.util.Stack;

//trapping rain water
public class Prac4 {
    // next greater
    public static void rightGreater(int[] height, int[] nextGreater) {
        Stack<Integer> stk = new Stack<>();

        for (int i = height.length - 1; i >= 0; i--) {
            if (!stk.isEmpty() && height[i] < stk.peek()) {
                nextGreater[i] = stk.peek();
            } else {
                stk.push(height[i]);
                nextGreater[i] = stk.peek();
            }
        }
    }

    // prev greater
    public static void lftGreater(int[] height, int[] prevGreater) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < height.length; i++) {
            if (!stk.isEmpty() && height[i] < stk.peek()) {
                prevGreater[i] = stk.peek();
            } else {
                stk.push(height[i]);
                prevGreater[i] = stk.peek();
            }
        }
    }

    // func to calc volm of water trapped
    public static int waterTrapped(int[] height) {
        int n = height.length;
        int[] nextGreater = new int[n];
        int[] prevGreater = new int[n];

        // finding next/prev greater
        rightGreater(height, nextGreater);
        lftGreater(height, prevGreater);

        // to calc water vol
        int vol = 0;
        int currVol;
        for (int i = 0; i < n; i++) {
            currVol = Math.min(prevGreater[i], nextGreater[i]) - height[i];

            vol += currVol;
        }

        return vol;
    }

    // main func
    public static void main(String[] args) {
        int[] height = { 0, 3, 0, 1, 0, 2, 0, 4 };

        int vol = waterTrapped(height);

        System.out.println("Water trapped : " + vol);
    }
}
