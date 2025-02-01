package Java_Learning.ArrayList;

import java.util.ArrayList;

//container with most water
//optimized method

public class Prac7 {
    static void maxVol(ArrayList<Integer> height) {
        int leftPtr = 0;
        int rightPtr = height.size() - 1;
        int maxVol = 0;

        while (leftPtr < rightPtr) {

            int currHeight = Math.min(height.get(leftPtr), height.get(rightPtr));
            int weidth = rightPtr - leftPtr;
            int currVol = currHeight * weidth;
            maxVol = Math.max(maxVol, currVol);

            // update ptr
            if (height.get(leftPtr) < height.get(rightPtr)) {
                leftPtr++;
            } else {
                rightPtr--;
            }

        }

        // to print maxVol
        System.out.println("Max vol : " + maxVol);
    }

    // main func
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