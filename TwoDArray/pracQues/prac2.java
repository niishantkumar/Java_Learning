package Java_Learning.TwoDArray.pracQues;

//Print out the sum of the numbers in the second row of the “nums” array

public class prac2 {
    // func for sum of 2nd row
    public static int sum2ndRow(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }

    // main func
    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        // displaying array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum is : " + sum2ndRow(nums));
    }
}