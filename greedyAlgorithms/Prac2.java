package Java_Learning.greedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//Activity selection problem (when not sorted on basis of end time)

public class Prac2 {

    public static void main(String[] args) {
        int start[] = { 0, 1, 3, 5, 5, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };

        // 2dArray to store activity no, start time, end time
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sort on basis of end time
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // to count num of act selected and store their name
        int maxAct = 0;
        ArrayList<Integer> actSelected = new ArrayList<>();

        // first activity is always selected
        actSelected.add(activities[0][0]);
        maxAct++;
        int lastEnd = activities[0][2];

        // loop to select suitable activity
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // select activity
                maxAct++;
                actSelected.add(activities[i][0]);
                lastEnd = activities[i][2];
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