package Java_Learning.recursionBasicsP1;

//print numbers from n to 1 (increasing order)

public class prac2 {

    // func to print numbers from n to 1
    public static void printIncreasing(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printIncreasing(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        printIncreasing(10);
    }
}