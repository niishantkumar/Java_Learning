package Java_Learning.array2;

//rainwater trapping problem - brute force

public class prac4 {
    public static void waterTrapped(int arrayOfHeight[]) {

        int waterStored = 0;

        for (int i = 1; i < arrayOfHeight.length-1; i++) {

            int maxRight = 0;
            int maxLeft = 0;

            // max height towards right
            for (int j = i + 1; j < arrayOfHeight.length; j++) {

                maxRight = Math.max(maxRight, arrayOfHeight[j]);
            }

            // max height towards left
            for (int j = i - 1; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, arrayOfHeight[j]);
            }

            if (arrayOfHeight[i] > Math.min(maxRight, maxLeft)) {
                continue;
            }

            waterStored += (Math.min(maxRight, maxLeft) - arrayOfHeight[i]);
        }

        System.out.println("Vol of water stored = " + waterStored);
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        waterTrapped(height);
    }
}