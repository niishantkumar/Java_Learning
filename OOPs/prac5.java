package Java_Learning.OOPs;

//types of constructor

public class prac5 {
    public static void main(String[] args) {

        Student std1 = new Student();
        std1.getData();
        Student std2 = new Student(2);
        std2.getData();
        Student std3 = new Student(3, "Nishant");
        std3.getData();
    }
}

class Student {
    int roll;
    String name = "nii._shant";

    Student() { // non-parameterized
        roll = 1;
        name = "Nishant";
    }

    Student(int roll) { // parameterized
        this.roll = roll;
    }

    Student(int roll, String name) { // parameterized constructor
        this.roll = roll;
        this.name = name;
    }

    void getData() {
        System.out.println("Roll : " + roll);
        System.out.println("Name : " + name);
    }
}