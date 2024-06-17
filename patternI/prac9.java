package Java_Learning.patternI;
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

public class prac9 {
    public static void main(String[] args) {

        int num = 1;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
