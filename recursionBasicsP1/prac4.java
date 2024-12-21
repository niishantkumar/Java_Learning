//sum of n natural numbers

public class prac4 {

    // sum of n natural numbers
    public static int sum_nNatural(int num) {
        int sum = 0;

        if (num == 1) {
            return 1;
        }

        sum = num + sum_nNatural(num - 1);

        return sum;
    }

    // main func
    public static void main(String[] args) {

        System.out.println("Sum of natural nums till "+10+" is : "+sum_nNatural(10));

    }
}