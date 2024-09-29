package Java_Learning.OOPs.pracQues;

/*
 Print the sum,difference and product of two complex numbers by creating a class named 'Complex' with separate
 methods for each operation whose real and imaginary parts are entered by the user 
 */
public class prac1 {

    
    public static void main(String[] args) {
        Complex c1 = new Complex(7, 2, 3, 4);

        c1.addComplex();
        c1.subComplex();
        c1.productComplex();
    }

}

class Complex {

    int r1, r2, m1, m2;
    int pR, pImg;

    Complex(int real1, int img1, int real2, int img2) {

        r1 = real1;
        r2 = real2;
        m1 = img1;
        m2 = img2;

    }

    void addComplex() {
        System.out.println("Sum : " + (r1 + r2) + " + " + (m1 + m2) + "i");
    }

    void subComplex() {
        System.out.println("Diffrence : " + (r1 - r2) + " + " + (m1 - m2) + "i");
    }

    void productComplex() {
        pR = (r1 * r2) - (m1 * m2);
        pImg = r1 * m2 + r2 * m1;

        System.out.println("Product : " + pR + " + " + pImg + "i");
    }
}