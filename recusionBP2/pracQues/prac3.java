package Java_Learning.recusionBP2.pracQues;

//Write a program to findLength of a String using Recursion

public class prac3 {

    public static int lenStr(String str, String newStr, int i) {

        if (str.equals(newStr)) {
            return i;
        }

        newStr += str.charAt(i);

        return lenStr(str, newStr, ++i);
    }

    public static void main(String[] args) {
        System.out.println("Length of Recursion : " + lenStr("Recursion", "", 0));
    }

}