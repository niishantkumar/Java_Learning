package Java_Learning.patternI;
/* 
A
B C
D E F
G H I J
*/

public class prac5 {
    public static void main(String[] args) {

        char a = 'A';
        for (int line = 1; line <= 4; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
