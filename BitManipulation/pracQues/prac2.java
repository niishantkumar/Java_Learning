package Java_Learning.BitManipulation.pracQues;

//Add 1 to an integer using Bit Manipulation

public class prac2 {

    public static void main(String[] args) {
        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -(~x));
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -(~x));
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -(~x));
    }

}