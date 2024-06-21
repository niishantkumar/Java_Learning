package Java_Learning.funcMethod;

//to show func overloading using diff types of parameter

public class prac7 {
    public static void sum(int a, int b) {
        System.out.println("The sum is : " + (a + b));
    }

    public static void sum(float a, float b) {
        System.out.println("The sum is : " + (a + b));
    }

    public static void sum(float a, int b) {
        System.out.println("The sum is : " + (a + b));
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(10.2f, 20f);
        sum(10.2f, 20);
    }
}
