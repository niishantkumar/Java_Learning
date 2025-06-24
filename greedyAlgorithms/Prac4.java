package Java_Learning.greedyAlgorithms;

import java.util.Arrays;

//minimum sum absolute diff pairs problem

public class Prac4 {

    public static void main(String[] args) {

        // sample input 1
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 2, 1, 3 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int min_abs_diff = 0;

        for (int i = 0; i < arr1.length; i++) {
            min_abs_diff += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println("Minimum sum absolute diff : " + min_abs_diff);

        // sample input 2
        arr1 = new int[] { 4, 1, 8, 7 };
        arr2 = new int[] { 2, 3, 6, 5 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        min_abs_diff = 0;

        for (int i = 0; i < arr1.length; i++) {
            min_abs_diff += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println("Minimum sum absolute diff : " + min_abs_diff);
    }
}