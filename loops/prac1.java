package Java_Learning.loops;

import java.util.Scanner;

//to display all numbers entered by user except multiple of 10

public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        // taking array input
        for (int i = 0; i < 6; i++) {
            System.out.print("Eneter element : ");
            arr[i] = sc.nextInt();
        }

        // displaying elements except multiple of 10
        for (int i = 0; i < 6; i++) {
            if (arr[i] % 10 == 0) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
