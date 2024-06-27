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

    // to print inverted and rotated half pyramid with number
    public static void rotHalfPyrNum() {
        int totalLine = 5;
        for (int i = 1; i <= totalLine; i++) {
            // loop for numbers
            for (int j = 1; j <= totalLine - i + 1; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // to print floyd'strianle
    public static void floyds_triangle() {
        int totalLine = 5;
        int trianleNumbers = 0;

        for (int i = 1; i <= totalLine; i++) {

            // loop for numbers
            for (int j = 1; j <= i; j++) {
                trianleNumbers++;
                System.out.print(trianleNumbers + " ");
            }
            System.out.println();
        }
    }

    // to print 0-1 trianle
    public static void zero_one_triangle() {
        int totalLine = 5;

        for (int i = 1; i <= totalLine; i++) {

            // loop for numbers
            for (int j = 1; j <= i; j++) {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // squarePat();
        zero_one_triangle();
    }
}