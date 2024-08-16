package Java_Learning.Strings;

import java.util.Scanner;

//substring

public class prac5 {
    // func for subString
    public static String subString(String str, int start, int end) {

        String subStr = "";
        for (int i = start; i < end; i++) {
            subStr += str.charAt(i);
        }

        return subStr;
    }

    // main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = sc.nextLine();

        System.out.println("Enter range :");
        int start = sc.nextInt();
        int end = sc.nextInt();

        // func made by me
        System.err.println("Your substring is : " + subString(str, start, end));

        // inbuilt func
        System.err.println("Your substring is : " + str.substring(0, 9));

        sc.close();
    }
}