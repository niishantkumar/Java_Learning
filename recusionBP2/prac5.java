package Java_Learning.recusionBP2;

//to print all combinations of binary stinr of size n,  but it should not contain consecutive 1's

public class prac5 {
    public static void printBinStr(int n, int lastBit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinStr(n - 1, 0, str + '0');

        if (lastBit == 0) {
            printBinStr(n - 1, 1, str + '1');
        }
    }

    public static void main(String[] args) {
        printBinStr(4, 0, "");
    }
}