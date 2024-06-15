package Java_Learning.patternI;

/*
1
1 2
1 2 3
1 2 3 4
 */

public class prac3 {
    public static void main(String[] args) {
        for (byte i = 1; i <= 4; i++) {
            for (byte j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
