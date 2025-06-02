package Java_Learning.StackP2;

import java.util.Stack;

public class Prac3 {

    // Find indices of next smaller elements to the right
    public static void nextLesser(int[] height, int[] rightLess) {
        Stack<Integer> stk = new Stack<>();
        int n = height.length;

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && height[i] <= height[stk.peek()]) {
                stk.pop();
            }
            rightLess[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
    }

    // Find indices of previous smaller elements to the left
    public static void prevLesser(int[] height, int[] leftLess) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < height.length; i++) {
            while (!stk.isEmpty() && height[i] <= height[stk.peek()]) {
                stk.pop();
            }
            leftLess[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
    }

    // Compute max area in the histogram
    public static int maxArea(int[] height) {
        int n = height.length;
        int[] leftLess = new int[n];
        int[] rightLess = new int[n];

        prevLesser(height, leftLess);
        nextLesser(height, rightLess);

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rightLess[i] - leftLess[i] - 1;
            int area = height[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 2, 1, 5, 6, 2, 3 };
        System.out.println("Maximum Area: " + maxArea(height)); // Output: 10
    }
}
