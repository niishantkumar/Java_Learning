package Java_Learning.BitManipulation;

//to check if a num is in power of 2

public class prac7 {
    // func to check whether pow of 2
    public static boolean powOf2(int num) {

        return (num & (num - 1)) == 0;
    }

    // main func
    public static void main(String[] args) {

        System.out.println(powOf2(9));

    }
}