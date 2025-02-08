package Java_Learning.ArrayList.pracQues;
/*
  Monotonic ArrayList(EASY)An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
  An Arraylist nums ismonotone increasing if for all i<=j, nums.get(i) <= nums.get(j).
  An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
  
  Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
  Sample Input 1: nums = [1,2,2,3]
  Sample Output 1: true
  
  Sample Input 2: nums = [6,5,4,4]
  Sample Output 2: true
  
  Sample Input 3: nums = [1,3,2]
  Sample Output 3: false
 */

import java.util.ArrayList;

public class Prac1 {
    // func to check whether ArrayList is monotone
    static boolean isMonotone(ArrayList<Integer> list) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                isDecreasing = false; // it's not decreasing, so flag as false
            }
            if (list.get(i) > list.get(i + 1)) {
                isIncreasing = false; // it's not increasing, so flag as false
            }
        }

        // If it's either increasing or decreasing, it's monotonic
        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Sample Input 1
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(isMonotone(list)); // Expected output: true

        // Sample Input 2
        list.clear();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);

        System.out.println(isMonotone(list)); // Expected output: true

        // Sample Input 3
        list.clear();
        list.add(1);
        list.add(3);
        list.add(2);

        System.out.println(isMonotone(list)); // Expected output: false
    }
}
