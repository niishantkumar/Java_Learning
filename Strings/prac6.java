package Java_Learning.Strings;

//for a ginev set of strings, print the largest

public class prac6 {
    // func to return largest string
    public static String largestString(String fruits[]) {
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }

    // main func
    public static void main(String[] args) {

        String fruits[] = { "apple", "mango", "banana" };

        System.out.println("Largest string is : " + largestString(fruits));
    }
}