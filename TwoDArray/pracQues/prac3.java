package Java_Learning.TwoDArray.pracQues;

//Write a program to FindTransposeofa Matrix

public class prac3 {
    // func for transpose of matrix
    public static void transpose(int arr[][]) {

        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    // main func
    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        // displaying matrix
        System.out.println("Actual matrix :");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // displaying transpose
        System.out.println("Transpose matrix :");
        transpose(nums);
    }
}