package Java_Learning.greedyAlgorithms.PracQues;

public class Prac1 {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";

        int lCount = 0;
        int rCount = 0;
        int subBalanced = 0;
        int lastPoint = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                lCount++;
            }
            if (str.charAt(i) == 'R') {
                rCount++;
            }

            if (lCount == rCount) {
                subBalanced++;
                System.out.print(str.substring(lastPoint, i + 1) + " ");
                lastPoint = i;

                lCount = 0;
                rCount = 0;
            }
        }

        System.out.println("\nTotal subbalanced strings are : " + subBalanced);
    }
}