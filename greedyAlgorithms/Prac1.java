package Java_Learning.greedyAlgorithms;

import java.util.ArrayList;

//Activity selection problem

public class Prac1 {

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 0; // 0 because no activity selected yet
        ArrayList<Integer> actSelected = new ArrayList<>(); // to sotre name of act selected

        // 1st act
        maxAct++; // act1 is selected as it takes min time
        actSelected.add(0);
        int lastEnd = end[0]; // end time of act1

        // loop to check which other activies will be selected
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // act select
                maxAct++;
                actSelected.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max activies selected : " + maxAct);
        // to print act selected
        System.out.println("Activies selected :");
        for (int i = 0; i < actSelected.size(); i++) {
            System.out.print("A" + actSelected.get(i) + " ");
        }
    }

}