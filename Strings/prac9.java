package Java_Learning.Strings;

/*
String compression
"aaabbbbbccdddd" to "a3b5c2d4"
 */

public class prac9 {
    // func for compression
    public static String compressString(String str) {
        StringBuilder compStr = new StringBuilder("");
        int count, i, j;

        for (i = 0; i < str.length(); i++) {
            compStr.append(str.charAt(i));
            count = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            compStr.append(count);
            i = j-1;
        }
        return compStr.toString();
    }

    // main func
    public static void main(String[] args) {
        String str = "aaabbbbbccdddd";
        System.out.println("Compressed String : " + compressString(str));
    }
}
