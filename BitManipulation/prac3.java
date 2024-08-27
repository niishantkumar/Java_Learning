package Java_Learning.BitManipulation;

//get ith bit, set ith bit

public class prac3 {
    // func to find ith bit
    public static void get_ithBit(int num, int i) {
        if ((num & (1 << i)) == 0) {
            System.out.println("ith bit is 0");
        } else {
            System.out.println("ith bit is 1");
        }
    }

    // func to set ith bit
    public static void set_ithBit(int num, int setNum, int i) {
        int bitMask = setNum << i;

        num = num | bitMask;

        System.out.println(num);
    }

    // func to clear ith bit
    public static void clear_ithBit(int num, int i) {
        int bitMask = ~(1 << i);

        num = num & bitMask;

        System.out.println(num);
    }

    // main func
    public static void main(String[] args) {

        // func call
        get_ithBit(10, 2);
        set_ithBit(10, 1, 2);
        clear_ithBit(10, 1);
    }
}