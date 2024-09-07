package Java_Learning.BitManipulation;

//clear range of bits

public class prac6 {
    // func for clear range of bits
    public static int clearBitsInRange(int num, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;

        return num & bitMask;
    }

    // main func
    public static void main(String[] args) {

        System.out.println(clearBitsInRange(10, 2, 4));

    }
}