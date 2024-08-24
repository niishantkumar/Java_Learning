package Java_Learning.Strings.pracQues;

import java.util.Arrays;

/*
Determine if 2 Strings are anagrams of each other.
What are anagrams?
If two strings contain the same characters but in a different order,they can be said to be anagrams.
Consider race and care
*/

public class prac2 {

    // func to check anagrams
    public static void anagrams(String str1, String str2) {

        if (str1.length() == str2.length()) {

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }

    }

    // main func
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        anagrams(str1, str2);
    }

}
