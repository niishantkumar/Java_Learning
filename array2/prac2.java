package Java_Learning.array2;

import java.util.Scanner;

//using prefix sum

public class prac2 {
    // func to print max subarray sum
    public static void printSubArray_MaxSum(int array[]) {
        int prefix[] = new int[array.length];

        prefix[0] = array[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int tempSum;

        for (int i = 0; i < array.length; i++) {
            int start = i;

            for (int j = i; j < array.length; j++) {
                int end = j;
                tempSum = 0;
                tempSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < tempSum) {
                    maxSum = tempSum;
                }
            }
        }

        System.out.println("Max subarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of array size
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        // taking input of array
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + " : ");
            array[i] = sc.nextInt();
        }

        printSubArray_MaxSum(array);

        sc.close();
    }
}