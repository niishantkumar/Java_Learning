package Java_Learning.OOPs;

//static keyword

public class prac14 {

    public static void main(String[] args) {

        Student.school = "DAV Pundag";
        Student s1 = new Student("Nishant", 1);

        s1.getData();
        System.out.println("Percentage : " + Student.percentage(49, 48, 47));

        Student s2 = new Student("Singh", 2);
        s2.getData();
        System.out.println("Percentage : " + Student.percentage(47, 48, 47));
    }
}

class Student {
    String name;
    int roll;
    static String school;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    static float percentage(int math, int chem, int phy) {
        return ((math + chem + phy) / 3);
    }

    void getData() {
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + roll);
        System.out.println("School : " + school);
    }
}