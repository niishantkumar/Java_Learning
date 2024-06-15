package Java_Learning.patternI;

/*
A
A B
A B C
A B C D
 */

public class prac4 {
    public static void main(String[] args) {
        for (char a = 'A'; a <= 'D'; a++) {
            for (char b = 'A'; b <= a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
