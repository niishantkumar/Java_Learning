package Java_Learning.OOPs;

//jst to check initialisation value of a int static variable

public class prac16 {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Animal a1 = new Animal();
    }

}

class Animal {
    static int count;
    int random;

    Animal() {
        System.out.println(count);
        System.out.println(random);
        count++;
    }
}