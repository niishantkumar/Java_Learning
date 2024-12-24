package Java_Learning.recusionBP2;

//remove duplicates from string

public class prac1 {

    /*
     * public static String removeDup(String str, int i) {
     * 
     * if (i == str.length() - 1) {
     * return "";
     * }
     * 
     * char presentChar = str.charAt(i);
     * 
     * String newString = removeDup(str, i + 1);
     * 
     * for (int j = 0; j < newString.length(); j++) {
     * if (presentChar == newString.charAt(j)) {
     * return newString;
     * }
     * }
     * 
     * return newString + presentChar;
     * 
     * }
     */

    // as per apna college
    public static void removeDuplicate(String str, int ind, StringBuilder newStr, boolean map[]) {

        if (ind == str.length()) {
            return;
        }

        char presentChar = str.charAt(ind);

        if (map[presentChar - 'a']) {
            removeDuplicate(str, ind + 1, newStr, map);
        } else {
            map[presentChar - 'a'] = true;
            newStr.append(presentChar);
            removeDuplicate(str, ind + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        // as per my logic
        // System.out.println(removeDup("appnnacollege", 0));

        boolean map[] = new boolean[26];
        StringBuilder newString = new StringBuilder();
        removeDuplicate("appnnacollege", 0, newString, map);

        System.out.println(newString);

    }
}