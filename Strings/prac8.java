package Java_Learning.Strings;

import java.util.Scanner;

//for a given String convert each the first letter of each word to uppercase

public class prac8 {

    // func to convert each of the first letter to upper case
    public static String toUpperCase(String str) {
        StringBuilder convrtString = new StringBuilder("");

        convrtString.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                convrtString.append(str.charAt(i));
                i++;
                convrtString.append(Character.toUpperCase(str.charAt(i)));

            } else {
                convrtString.append(str.charAt(i));
            }

        }

        return convrtString.toString();
    }

    // main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("Modified string : " + toUpperCase(str));

        sc.close();
    }
}