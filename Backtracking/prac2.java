package Java_Learning.Backtracking;

//subset of a string

public class prac2 {

    // func for subset
    public static void subset(String str, String ans, int i) {

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }

            return;
        }

        subset(str, ans + str.charAt(i), i + 1);
        subset(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";

        subset(str, "", 0);
    }
}