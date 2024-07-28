package Java_Learning.TwoDArray;

//sum of elements of diagonals of a matrix

public class prac7 {
    // func for diag sum
    public static void sum_PS_DiagElements(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            if (i != (matrix.length / 2)) {
                sum += matrix[i][i];
            }

            // if (i != matrix.length - i - 1)
            sum += matrix[i][matrix.length - i - 1];
        }

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        sum_PS_DiagElements(matrix);
    }

}