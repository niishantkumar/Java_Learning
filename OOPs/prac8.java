package Java_Learning.OOPs;

//inheritance

public class prac8 {

    // main func
    public static void main(String[] args) {

        E_rick rick1 = new E_rick();

        rick1.wheel();
        rick1.battery();

    }

}

class Auto {
    String wheel;
    String engine;

    void wheel() {
        wheel = "mrf";
        System.out.println(wheel);
    }

    void engine() {
        System.out.println("plagio");
    }
}

class E_rick extends Auto {
    void battery() {
        System.out.println("Battery");
    }
}