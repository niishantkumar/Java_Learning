package Java_Learning.array1;

import java.util.Scanner;;

public class prac9 {
    // func to print pair of array
    public static void printSubArray(int array[]) {

        System.out.println("The pairs are :");
        for (int i = 0; i < array.length; i++) {
           

            for (int j = i+1; j <= array.length; j++) {
                System.out.print(array[i] + " ");
                
                for (int k = i+1; k < j; k++) {
                    System.out.print(array[k] + " ");
                }
                
                System.out.println();
            }
            System.out.println();

        }
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
