package Java_Learning.patternI;
/* 
* * * *
* * *
* *
*
 */

public class prac2 {
    public static void main(String[] args) {
        for (byte i = 1; i <= 4; i++) {
            for (byte j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
