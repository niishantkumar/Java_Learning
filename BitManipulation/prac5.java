package Java_Learning.BitManipulation;

//clear last i bits

public class prac5 {
    // func to clear last i bits
    public static int clear_IBits(int num, int i) {
        int bitMask = (~0) << i; // ~0 = -1

        return num & bitMask;
    }

    // main func
    public static void main(String[] args) {

        System.out.println("15 becomes : " + clear_IBits(15, 2));
    }
}
