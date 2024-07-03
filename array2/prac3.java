package Java_Learning.array2;

public class prac3 {
    // func to print max subarray sum
    public static void subArray_MaxSum(int array[]) {
        boolean allNegative = true;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        // loop to check if all elements are negative
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                allNegative = false;
                break;
            }
            maxSum = Math.max(maxSum, array[i]);
        }

        if (allNegative) {
            System.out.println("Max subarray sum = " + maxSum);
        } else {
            for (int i = 0; i < array.length; i++) {
                currentSum += array[i];
                if (currentSum < 0) {
                    currentSum = 0;
                }
                maxSum = Math.max(maxSum, currentSum);
            }
            System.out.println("Max subarray sum = " + maxSum);
        }
    }

    public static void main(String[] args) {
        int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        subArray_MaxSum(array);

    }
}