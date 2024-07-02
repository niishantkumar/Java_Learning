package Java_Learning.array1;

import java.util.Scanner;;

public class prac10 {
    // func to print subarray of an array and max sum
    public static void printSubArray(int array[]) {

        int sum = Integer.MIN_VALUE;

        System.out.println("The pairs are :");
        for (int i = 0; i < array.length; i++) {
            int start = i;

            for (int j = i; j <= array.length; j++) {
                int end = j;
                int tempSum = 0;

                for (int k = start; k < end; k++) {
                    System.out.print(array[k] + " ");
                    tempSum += array[k];
                }

                if (sum < tempSum) {
                    sum = tempSum;
                }

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Max subarray sum = " + sum);
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

        printSubArray(array);

        sc.close();
    }
}
