package Java_Learning.patternII;

import java.util.Scanner;

//prgm to print different patterns

public class patternClass {
    // to print square pattern
    public static void squarePat(int length) {

        for (int row = 1; row <= length; row++) {
            for (int col = 1; col <= length; col++) {
                if (row == 1 || row == length || col == 1 || col == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // to print rectangle pattern
    public static void rectanglePat(int length, int breadth) {

        for (int row = 1; row <= length; row++) {
            for (int col = 1; col <= breadth; col++) {
                if (row == 1 || row == length || col == 1 || col == breadth) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // to print inverted and rotated half pyramid
    public static void rotHalfPyr(int length) {

        for (int line = 1; line <= length; line++) {

            // loop for space
            for (int space = 1; space <= length - line; space++) {
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
    public static void rotHalfPyrNum(int length) {

        for (int i = 1; i <= length; i++) {
            // loop for numbers
            for (int j = 1; j <= length - i + 1; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // to print floyd'strianle
    public static void floyds_triangle(int length) {

        int trianleNumbers = 0;

        for (int i = 1; i <= length; i++) {

            // loop for numbers
            for (int j = 1; j <= i; j++) {
                trianleNumbers++;
                System.out.print(trianleNumbers + " ");
            }
            System.out.println();
        }
    }

    // to print 0-1 trianle
    public static void zero_one_triangle(int length) {

        for (int i = 1; i <= length; i++) {

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
    public static void butterflyPattern(int length) {

        // loop for 1st half
        for (int i = 1; i <= length; i++) {

            // loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for spaces
            for (int j = 1; j <= (length - i) * 2; j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // loop for 2nd half
        for (int i = length; i >= 1; i--) {

            // loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // for spaces
            for (int j = 1; j <= (length - i) * 2; j++) {
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
    public static void solidRhombus_pattern(int length) {

        for (int i = 1; i <= length; i++) {
            // loop for space
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }

            // for star
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // to print hollow rhombus
    public static void hollowRhombus_pattern(int length) {

        for (int i = 1; i <= length; i++) {
            // for spaces
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }

            // for star
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == length || j == 1 || j == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    // to print dimond pattern
    public static void dimond_pattern(int length) {

        // to print 1st half
        for (int i = 1; i <= length; i++) {
            // loop for space
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }

            // loop for star
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // to print 2nd half
        for (int i = length; i >= 1; i--) {
            // loop for space
            for (int j = 1; j <= length - i; j++) {
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
            case 1: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                squarePat(length);
                break;
            }
            case 2: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                System.out.print("Enter breadth : ");
                int breadth = sc.nextInt();
                rectanglePat(length, breadth);
                break;
            }
            case 3: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                rotHalfPyr(length);
                break;
            }

            case 4: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                rotHalfPyrNum(length);
                break;
            }

            case 5: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                floyds_triangle(length);
                break;
            }

            case 6: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                zero_one_triangle(length);
                break;
            }

            case 7: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                butterflyPattern(length / 2);
                break;
            }

            case 8: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                solidRhombus_pattern(length);
                break;
            }

            case 9: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                hollowRhombus_pattern(length);
                break;
            }

            case 10: {
                System.out.print("Enter length : ");
                int length = sc.nextInt();
                dimond_pattern(length / 2);
                break;
            }

            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}