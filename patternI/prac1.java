package Java_Learning.patternI;
/* 
*
* *
* * *
* * * *
 */

public class prac1 {
    public static void main(String[] args) {
        for (byte i = 1; i <= 4; i++) {
            for (byte j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
