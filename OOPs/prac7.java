package Java_Learning.OOPs;

//shallow and deep copy

public class prac7 {

    // main func
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Nishant Singh";
        s1.marks[0] = 1;
        s1.marks[1] = 2;
        s1.marks[2] = 3;

        Student s2 = new Student(s1);

        s1.marks[0] = 6;
        s1.getData();
        s2.getData();
    }

}

class Student {
    int roll;
    String name;
    int marks[];

    Student() { // non parameterized const
        marks = new int[3];
    }

    // shallow copy
    Student(Student s) { // copy const
        marks = new int[3];

        this.roll = s.roll;
        this.name = s.name;

        this.marks = s.marks;
    }

    // // deep copy
    // Student(Student s) { // copy const
    // marks = new int[3];

    // this.roll = s.roll;
    // this.name = s.name;

    // for (int i = 0; i < marks.length; i++) {
    // this.marks[i] = s.marks[i];
    // }
    // }

    void getData() {
        System.out.println("Roll : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Marks :");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\n");
    }
}