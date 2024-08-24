package Java_Learning.Strings.pracQues;

import java.util.Scanner;

//Count how many times lowercase vowels occurred in a String entered by the user.

public class prac1 {

    // func to count lowercase vovels in a string
    public static int countLowerVovl(String str) {
        int count = 0;

        char ch;

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    // main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sc.nextLine();

        System.out.println("Count of vovel is : " + countLowerVovl(str));

        sc.close();
    }
}