package Java_Learning.array1;

public class prac4 {
    public static int binSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[] = {"Violet", "Indigo","Blue", "Green", "Yellow", "Orange", "Red"};

        int index = binSearch(arr, "Red");

        if(index == -1){
            System.out.print("No match found");
        }
        else{
            System.out.println("Element is at index : "+index);
        }
    }
}