package Java_Learning.Strings;

//check if a string is palidrome...eg : noon, madam

public class prac2 {
    // func to check palidrome
    public static boolean palidrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // loop for comp
        while (start < str.length()) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // func to check palidrome
    public static void palidrome2(String str) {
        int start = 0;
        int end = str.length() - 1;

        // loop for comp
        while (start < str.length()) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println(str + " is not a palidrome.");
                break;
            }
            start++;
            end--;

            if (start == str.length()) {
                System.out.println(str + " is a palidrome.");
            }
        }
    }

    // main func
    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "noon";
        String word3 = "hide";

        palidrome2(word1);
        palidrome2(word2);
        palidrome2(word3);
    }
}