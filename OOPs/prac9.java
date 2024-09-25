package Java_Learning.OOPs;

//method overloading

public class prac9 {

    public static void main(String[] args) {

        Calculator sum = new Calculator();

        System.out.println("3 + 4 = " + sum.sum(3, 4));
        System.out.println("3.3 + 4.3 = " + sum.sum(3.3f, 4.3f));
        System.out.println("3 + 4 + 5 = " + sum.sum(3, 4, 5));

    }

}

class Calculator {

    int sum(int a, int b) {
        return (a + b);
    }

    float sum(float a, float b) {
        return (a + b);
    }

    int sum(int a, int b, int c) {
        return (a + b + c);
    }
}