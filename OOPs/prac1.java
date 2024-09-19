package Java_Learning.OOPs;

//simple example of class and object

public class prac1 {
    public static void main(String[] args) {
        pen p1 = new pen();

        p1.color = "Red";
        p1.size = 3;

        p1.display();

    }
}

class pen {
    String color;
    int size;

    void setColor(String newColor) {
        color = newColor;
    }

    void setSize(int newSize) {
        size = newSize;
    }

    void display() {
        System.out.println("The color is : " + color);
        System.out.println("The size is : " + size);
    }
}