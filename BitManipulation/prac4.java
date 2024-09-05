package Java_Learning.BitManipulation;

//update ith bit

public class prac4 {

    // func to clear ith bit
    public static int clear_ithBit(int num, int i) {
        int bitMask = ~(1 << i);

        return (num & bitMask);
    }

    // func to set ith bit
    public static int set_ithBit(int num, int i) {
        int bitMask = 1 << i;

        return (num | bitMask);
    }

    // func to update ith bit
    public static int updateIthBit(int num, int i, int newbit) {

        // 1st approach
        // if (newbit == 0) {
        // return (clear_ithBit(num, i));

        // } else {
        // return (set_ithBit(num, i));
        // }

        // 2nd approach
        num = clear_ithBit(num, i);
        int bitMask = newbit << i;
        return num | bitMask;

    }

    // main func
    public static void main(String[] args) {

    }
}