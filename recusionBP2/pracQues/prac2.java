package Java_Learning.recusionBP2.pracQues;

/*
 * You are given a number (eg - 2019), convert it into a String of english
 * like “two zero one nine”.  Use a recursive function to solve this problem.
 */

public class prac2 {

    public static void digiToWord(int num, String arr[]) {

        if (num == 0) {
            return;
        }

        int currentDigi = num % 10;

        digiToWord(num / 10, arr);

        System.out.print(arr[currentDigi] + " ");
    }

    public static void main(String[] args) {

        String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        int num = 1947;

        digiToWord(num, arr);

    }
}