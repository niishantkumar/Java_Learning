package Java_Learning.patternII;

import java.util.Scanner;

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

    // to print butterfly Pattern
    public static void butterflyPattern() {
        int totalLine = 5;

        // loop for 1st half
        for (int i = 1; i <= totalLine; i++) {

            // loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for spaces
            for (int j = 1; j <= (totalLine - i) * 2; j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // loop for 2nd half
        for (int i = totalLine; i >= 1; i--) {

            // loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for spaces
            for (int j = 1; j <= (totalLine - i) * 2; j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // to print solid rhombus
    public static void solidRhombus_pattern() {
        int totalLine = 5;

        for (int i = 1; i <= totalLine; i++) {
            // loop for space
            for (int j = 1; j <= totalLine - i; j++) {
                System.out.print(" ");
            }

            // for star
            for (int j = 1; j <= totalLine; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // to print hollow rhombus
    public static void hollowRhombus_pattern() {
        int totalLine = 5;

        for (int i = 1; i <= totalLine; i++) {
            // for spaces
            for (int j = 1; j <= totalLine - i; j++) {
                System.out.print(" ");
            }

            // for star
            for (int j = 1; j <= totalLine; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    // to print dimond pattern
    public static void dimond_pattern() {
        int totalLine = 4;

        // to print 1st half
        for (int i = 1; i <= totalLine; i++) {
            // loop for space
            for (int j = 1; j <= totalLine - i; j++) {
                System.out.print(" ");
            }

            // loop for star
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // to print 2nd half
        for (int i = totalLine; i >= 1; i--) {
            // loop for space
            for (int j = 1; j <= totalLine - i; j++) {
                System.out.print(" ");
            }

            // loop for star
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The choices are :");
        System.err.println(
                "1. Square Pattern\n2. Rectangle Pattern\n3. Rotated Half Pyramid with star pattern\n4. Rotated Half Pyramid with number pattern\n5. Floyd's Triangle\n6. Zero-One Triangle\n7. Butterfly Pattern\n8. Solid Rhombus Pattern\n9. Hollow Rhombus Pattern\n10. Diamond Pattern");
        System.out.print("Enter your choice (1/2/3/4/5/6/7/8/9/10): ");
        int choice = sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        switch (choice) {
            case 1:
                squarePat();
                break;
            case 2:
                rectanglePat();
                break;
            case 3:
                rotHalfPyr();
                break;
            case 4:
                rotHalfPyrNum();
                break;
            case 5:
                floyds_triangle();
                break;
            case 6:
                zero_one_triangle();
                break;
            case 7:
                butterflyPattern();
                break;
            case 8:
                solidRhombus_pattern();
                break;
            case 9:
                hollowRhombus_pattern();
                break;
            case 10:
                dimond_pattern();
                break;

            default:
                System.out.println("Invalid choice");
                ;
        }
        sc.close();
    }
}