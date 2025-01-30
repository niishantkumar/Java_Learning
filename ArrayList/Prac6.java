package Java_Learning.ArrayList;

import java.util.ArrayList;

//container with most water
//brute force method

public class Prac6 {
    // func to find max vol
    static void maxVol(ArrayList<Integer> height) {
        int maxVol = 0;
        int maxHeight = 0;
        int width = 0;
        int tempVol = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                maxHeight = Math.min(height.get(i), height.get(j));
                width = j - i;
                tempVol = maxHeight * width;

                maxVol = Math.max(maxVol, tempVol);
            }
        }

        System.out.println("Max water stored : " + maxVol);

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        maxVol(height);
    }

}