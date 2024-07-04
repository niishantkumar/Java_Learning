package Java_Learning.loops;

import java.util.Scanner;

/*
Given an integer A representing the number of square blocks. The height of each square block is 1.
The task is to create a staircase of max-height using these blocks.
The first stair would require only one block, and the second stair would require two blocks, and so on.
Find and return the maximum height of the staircase
*/

public class prac7 {
    public static int maxHeight(int numBlocks) {
        int maxHeight = 0;

        int stairCase = 1;

        for (int i = 1; i <= numBlocks; i++) {
            if (numBlocks < stairCase) {
                break;
            }
            numBlocks -= stairCase;
            maxHeight = stairCase;
            stairCase++;
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of blocks : ");
        int numBlocks = sc.nextInt();

        System.out.println("Maximum height : " + maxHeight(numBlocks));

        sc.close();
    }
}