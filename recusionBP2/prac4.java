package Java_Learning.recusionBP2;

import java.util.Scanner;

//to print binary string...If string contains consecutive ones then it should not be printed

public class prac4 {

    public static boolean printBinStr(String str, int n) {
        if (n == str.length() - 1) {
            System.out.println("Srint is : " + str);
            return true;
        }

        if (str.charAt(n) == str.charAt(n + 1) && str.charAt(n) == '1') {
            return false;
        }

        return printBinStr(str, n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string : ");
        String str = sc.next();

        printBinStr(str, 0);

        sc.close();
    }

}