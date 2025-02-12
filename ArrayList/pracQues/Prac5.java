package Java_Learning.ArrayList.pracQues;

// Most Frequent Number following Key(EASY)
//my solution
//tc = O(n)
//sc = O(1)

import java.util.ArrayList;

public class Prac5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        Solution ob = new Solution();
        System.out.println(ob.mostFrequent(list, 2));
    }
}

class Solution {
    public int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[1000]; // Frequency array

        // Count occurrences of numbers appearing after 'key'
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1)-1]++;
            }
        }

        // Find the most frequent number
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i+1;
            }
        }

        return ans;
    }
}
