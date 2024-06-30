package Java_Learning.array1;

import java.util.Scanner;

//to find largest in an array

public class prac5 {
    // func to find largest int in an array
    public static int largestInt_inArray(int array[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of array size
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        // declaring array
        int arr[] = new int[size];

        // taking input of array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // displaying array
        System.out.println();
        System.out.println("Your array is :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("\nThe largest element is : " + largestInt_inArray(arr));

        sc.close();
    }
}