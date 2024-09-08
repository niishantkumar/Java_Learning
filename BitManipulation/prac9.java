package Java_Learning.BitManipulation;

//fast exponentiation

public class prac9 {
    // func to calculate exponentiation
    public static int powOf(int num, int pow) {
        int ans = 1;

        while (pow > 0) {
            if ((pow & 1) != 0) {
                ans = ans * num;
            }
            num = num * num;
            pow = pow >> 1;
        }

        return ans;
    }

    // main func
    public static void main(String[] args) {
        System.err.println("3 power 5 : " + powOf(3, 5));
    }
}