package Java_Learning.DivideAndConquer.pracQues;

import java.util.Arrays;;

//Given an array nums of size n, return the majority element.(MEDIUM)
//The majority element is the element that appears more than ⌊n/2⌋ times.
//You may assume that the majority element always exists in the array.
//Sample Input 1: nums = [3,2,3]
//Sample Output 1: 3
//Sample Input 2: nums = [2,2,1,1,1,2,2]
//Sample Output 2: 2
//Constraints(extra Conditions):
//●n == nums.length
//●1 <= n <= 5 * 104
//●-109 <= nums[i] <= 109
public class prac4 {
    public static int majority(int arr[], int li, int count) {

        if (count > arr.length / 2) {
            return arr[li];
        }

        if (li == arr.length - 1) {
            return 0;
        }

        if (arr[li] == arr[li + 1]) {
            return majority(arr, li + 1, count + 1);
        }

        return majority(arr, li + 1, 1);

    }

    public static void main(String[] args) {
        int nums[] = { 3,2,3 };

        Arrays.sort(nums);

        // print nums
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Majority = " + majority(nums, 0, 1));
    }
}