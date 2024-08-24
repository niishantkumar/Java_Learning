package Java_Learning.BitManipulation;

//bit manipulation

public class prac1 {

    public static void main(String[] args) {
        // AND operator
        System.out.println("5 & 6 : " + (5 & 6));

        // OR operator
        System.out.println("5 | 6 : " + (5 | 6));

        // XOR operator
        System.out.println("5 ^ 6 : " + (5 ^ 6));

        // one's complement ~
        System.out.println("One's complement of 0 : " + (~0));

        // left shift
        System.out.println("5 << 2 = " + (5 << 2));

        // right shift
        System.out.println("6 >> 1 = " + (6 >> 1));
    }

}