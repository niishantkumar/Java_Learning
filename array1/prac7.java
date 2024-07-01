package Java_Learning.array1;

import java.util.Scanner;

public class prac7 {
    // func to reverse array
    public static void reverseArray(int array[]) {
        int temp;
        int end = array.length - 1;

        for (int i = 0; i < end; i++) {
            temp = array[i];
            array[i] = array[end];
            array[end] = temp;

            end--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input array size
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        // input of array
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at indeex " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // displaying of array
        System.out.println("Your array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        reverseArray(arr);

        // displaying of array after reversing
        System.out.println("Your array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
