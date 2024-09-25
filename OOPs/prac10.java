package Java_Learning.OOPs;

//method overriding

public class prac10 {

    // main func
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }

}

class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer {
    void eat() {
        System.out.println("Eats grass");
    }
}