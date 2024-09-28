package Java_Learning.OOPs;

//super keyword

public class prac15 {
    public static void main(String[] args) {

        E_rick r1 = new E_rick();
        System.out.println("Colour : " + r1.colour);

    }
}

class Auto {
    String colour;

    Auto() {
        System.out.println("Auto constructor is called");
    }
}

class E_rick extends Auto {
    E_rick() {
        super(); // this makes call constructor of parent class call first
        super.colour = "Yellow";
        System.out.println("E_rick constructor is called");
    }
}