package Java_Learning.patternII;

//prgm to print different patterns

public class patternClass {
    // to print square pattern
    public static void squarePat() {
        int totalRow = 5;
        int totalCol = 5;

        for (int row = 1; row <= totalRow; row++) {
            for (int col = 1; col <= totalCol; col++) {
                if (row == 1 || row == 5 || col == 1 || col == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // to print rectangle pattern
    public static void rectanglePat() {
        int totalRow = 4;
        int totalCol = 5;

        for (int row = 1; row <= totalRow; row++) {
            for (int col = 1; col <= totalCol; col++) {
                if (row == 1 || row == totalRow || col == 1 || col == totalCol) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // to print inverted and rotated half pyramid
    public static void rotHalfPyr() {
        int totalLine = 4;
        for (int line = 1; line <= totalLine; line++) {

            // loop for space
            for (int space = 1; space <= totalLine - line; space++) {
                System.out.print(" ");
            }
            // loop for star
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // squarePat();
        rotHalfPyr();
    }
}