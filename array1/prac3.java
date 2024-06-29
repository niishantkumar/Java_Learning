package Java_Learning.array1;

//binary search

public class prac3 {
    // func for binary search
    public static void binSearch(String arr[], String key) {
        boolean notFound = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                notFound = false;
                break;
            }
        }
        if (notFound) {
            System.out.println("No match");
        }
    }

    public static void main(String[] args) {
        String arr[] = { "Arth", "Dharm", "Kaam", "Moksh" };

        binSearch(arr, "Kaam");
    }
}