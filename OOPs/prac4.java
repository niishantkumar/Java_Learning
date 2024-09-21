package Java_Learning.OOPs;

import java.util.Scanner;

//use of constructor

public class prac4 {

    public static void main(String[] args) {

        student std1 = new student();
        student std2 = new student();

        System.out.println("Details of student are : ");
        std1.getData();
        std2.getData();

    }

}

class student {
    int enroll;
    String name;
    String course;
    Scanner sc = new Scanner(System.in);

    student() {
        System.out.print("Enter enroll : ");
        enroll = sc.nextInt();
        sc.nextLine(); // when we take input of an int and press enter, it(enter) is received in the
                       // form of '\n' and this remains in buffer

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        System.out.print("Enter Course : ");
        course = sc.nextLine();

    }

    void getData() {
        System.out.println("Enroll : " + enroll);

        System.out.println("Name : " + name);

        System.out.println("Course : " + course);
        System.out.println();
    }
}