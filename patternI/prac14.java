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
        int tLines2 = tLines;
        //for decrement of stars in 2nd half
        int sDec = 0;

        //loop for pattern
        for(int line = 1; line<=tLines;line++){

            //condition checking for 2nd half
            if(line>4)
            {
                tLines2 += 4;
                sDec += 4;
            }
            //loop for spaces
            for(int space = line; space<=tLines2/2;space++){
                System.out.print(" ");
            }

            //loop for stars
            for(int star = 1+sDec;star<=line*2-1;star++)
            {
                System.out.print("*");
            }

            //change of line
            System.out.println();
            
        }
    }
}
