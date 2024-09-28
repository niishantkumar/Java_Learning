package Java_Learning.OOPs;

//abstract class and abstract func

public class prac11 {
    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.legs();

        Monkey m1 = new Monkey();
        m1.legs();

        
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Constructor of abstract class Animal");
    }
    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void legs();
}

class Lion extends Animal {
    void legs() {
        System.out.println("Lions have four legs");
    }
}

class Monkey extends Animal{
    void legs() {
        System.out.println("Monkeys have two legs");
    }
}