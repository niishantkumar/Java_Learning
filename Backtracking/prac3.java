package Java_Learning.Backtracking;

//to form all possible combinations from a string

public class prac3 {
    // func to find all combinations
    public static void permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char curr;
        String newStr;

        for (int i = 0; i < str.length(); i++) {

            curr = str.charAt(i);

            // "abcde" => "ab" + "de" = "abde"
            newStr = str.substring(0, i) + str.substring(i + 1);

            permutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";

        permutation(str, "");
    }
}