package Java_Learning.recusionBP2;

//tiling problem

public class prac2 {
    // recursive func for counting number of ways tiling can be done
    public static int countWays(int breadth) {
        int count = 0;
        if (breadth == 0) {
            return 1;
        }

        if (breadth % 2 == 0) {
            breadth = breadth - 2;
            count = 2;
        } else {
            breadth = breadth - 1;
            count = 1;
        }

        return count + countWays(breadth);
    }

    public static void main(String[] args) {
        System.out.println(countWays(1));
    }
}