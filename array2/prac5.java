package Java_Learning.array2;

//rainwater trapping problem - brute force

public class prac5 {
    public static void waterTrapped(int height[]) {
        int length = height.length;

        // array of max right height
        int maxRight[] = new int[length];
        maxRight[length - 1] = height[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        for (int i = 0; i < length; i++) {
            System.out.print(maxRight[i] + " ");

        }
        System.out.println();

        // array of max left height
        int maxLeft[] = new int[length];
        maxLeft[0] = height[0];

        for (int i = 1; i < height.length; i++) {

            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        for (int i = 0; i < length; i++) {
            System.out.print(maxLeft[i] + " ");
            ;
        }
        System.out.println();

        int waterStored = 0;
        for (int i = 0; i < height.length; i++) {

            if (height[i] > Math.min(maxRight[i], maxLeft[i])) {
                continue;
            }

            waterStored += (Math.min(maxRight[i], maxLeft[i]) - height[i]);
        }

        System.out.println("Vol of water stored = " + waterStored);
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        waterTrapped(height);
    }
}