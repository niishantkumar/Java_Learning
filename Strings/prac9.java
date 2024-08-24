package Java_Learning.Strings;

/*
String compression
"aaabbbbbccdddd" to "a3b5c2d4"
 */

public class prac9 {
    // func for string compression with for loop
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
            i = j - 1;
        }
        return compStr.toString();
    }

    // func for string compression with while loop
    public static String compressString1(String str) {
        StringBuilder compStr = new StringBuilder("");
        int count;

        for (int i = 0; i < str.length(); i++) {

            compStr.append(str.charAt(i));
            count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            if (count > 1) {
                compStr.append(count);
            }

        }
        return compStr.toString();
    }

    // main func
    public static void main(String[] args) {
        String str = "aaabccddddeeeefgggg";
        System.out.println("Compressed String : " + compressString1(str));
    }
}
