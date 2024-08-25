package Java_Learning.BitManipulation;

//get ith bit, set ith bit

public class prac3 {
    // func to find ith bit
    public static void ithBit(int num, int i) {
        if ((num & (1 << i)) == 0) {
            System.out.println("ith bit is 0");
        } else {
            System.out.println("ith bit is 1");
        }
    }

    // main func
    public static void main(String[] args) {
        ithBit(10, 2);
    }
}