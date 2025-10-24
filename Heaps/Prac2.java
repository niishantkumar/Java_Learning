package Java_Learning.Heaps;

import java.util.PriorityQueue;

//PriorityQueue for object

public class Prac2 {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>();

        students.add(new Student("Anuj", 171));
        students.add(new Student("Nish", 164));
        students.add(new Student("Prat", 174));
        students.add(new Student("Viv", 152));

        while (!students.isEmpty()) {
            Student ob = students.remove();
            System.out.println(ob.name + " -> " + ob.rank);
        }
    }
}