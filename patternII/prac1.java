package Java_Learning.patternII;
/*
* * * * *
*       *
*       *
*       *
* * * * *
 */

public class prac1 {
    // to print square pattern
    public static void squarePat() {
        for (int line = 1; line <= 5; line++) {
            for (int col = 1; col <= 5; col++) {
                if (line == 1 || line == 5 || col == 1 || col == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squarePat();
    }

}
