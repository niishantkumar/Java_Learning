package Java_Learning.BitManipulation;

//to count set bits in a number

public class prac8 {
    // func to count bits in a number
    public static int countBits(int num) {
        int count = 0;

        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }

            num = num >> 1;

        }

        return count;
    }

    // main func
    public static void main(String[] args) {

        System.out.println("Set bits in 10 : "+countBits(10));
    }
}