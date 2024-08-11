package Java_Learning.Strings;

import java.util.Scanner;

//some funcs of strings

public class prac1 {
    // main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input output of stringSS
        System.out.print("Enter your full name : ");
        String name = sc.nextLine();
        System.out.println("Hi " + name);

        // string length func
        System.out.println("Your name has " + (name.length() - 1) + " letters");

        // concatenation
        name = "Mr " + name;
        System.out.println(name);

        // charAt method
        System.out.println("Your name starts with letter " + name.charAt(3));

        sc.close();

    }
}