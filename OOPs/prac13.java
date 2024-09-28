package Java_Learning.OOPs;

//show multiple inheritance

public class prac13 {

    public static void main(String[] args) {
        Omnivores m1 = new Omnivores();
        m1.eatsFlesh();
        m1.eatsVegetables();
    }
}

interface Herbivores {
    void eatsVegetables();
}

interface Carnivores {
    void eatsFlesh();
}

class Omnivores implements Herbivores, Carnivores {
    public void eatsFlesh() {
        System.out.println("Omnivores eat flesh");
    }

    public void eatsVegetables() {
        System.out.println("Omnivores eat Vegetables");
    }
}