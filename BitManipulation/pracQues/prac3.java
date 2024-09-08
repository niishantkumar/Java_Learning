package Java_Learning.BitManipulation.pracQues;

//Convert uppercase characters to lowercase using bits

public class prac3 {

    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(((char) (ch | ' '))+" ");
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }

}