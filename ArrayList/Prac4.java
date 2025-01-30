package Java_Learning.ArrayList;

//Sorting an ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class Prac4 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(0);
        list.add(4);
        list.add(10);
        list.add(8);

        // sort in ascending order
        Collections.sort(list);
        System.out.println("Sorted list in asc ord :");
        System.out.println(list);

        // sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list in desc ord :");
        System.out.println(list);
    }

}