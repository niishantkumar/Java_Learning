package Java_Learning.patternI;
/*
   *
  ***
 *****
*******
 *****
  ***
   *
 */

public class prac14 {
    public static void main(String[] args) {

        int tLines = 7;

        // for increment of space in 2nd half
        int spcInc = 0;
        // for decrement of stars in 2nd half
        int strDec = 0;

        // loop for pattern
        for (int line = 1; line <= tLines; line++) {

            // condition checking for 2nd half
            if (line > 4) {
                spcInc -= 2;
                strDec += 4;
            }
            // loop for spaces
            for (int space = line + spcInc; space <= tLines / 2; space++) {
                System.out.print(" ");
            }

            // loop for stars
            for (int star = 1 + strDec; star <= line * 2 - 1; star++) {
                System.out.print("*");
            }

            // change of line
            System.out.println();

        }
    }
}
