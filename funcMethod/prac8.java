package Java_Learning.funcMethod;

//to show func overloading using diff types of parameter

public class prac8 {
    public static void sum(int a, int b, int c) {
        System.out.println("The sum is : " + (a + b + c));
    }

    public static void sum(int a, int b) {
        System.out.println("The sum is : " + (a + b));
    }

    public static void main(String[] args) {
        sum(10, 20, 40);
        sum(10, 20);
    }
}
