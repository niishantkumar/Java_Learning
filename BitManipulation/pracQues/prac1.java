package Java_Learning.BitManipulation.pracQues;

//Swap two numbers without using any third variable

public class prac1 {

    // main func
    public static void main(String[] args) {
        int a = 3, b = 6;
        System.out.println("Before swapping :\na = " + a + "\nb = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping :\na = " + a + "\nb = " + b);

    }
}