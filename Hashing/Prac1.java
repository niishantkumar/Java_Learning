package Java_Learning.Hashing;

//HashMap Operations

import java.util.HashMap;

public class Prac1 {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        // put - O(1)
        students.put("Adarsh", 1);
        students.put("Anuj", 2);
        students.put("Nikhil", 3);

        System.out.println(students);

        // get - O(1)
        int rollAnuj = students.get("Anuj");
        System.out.println("Roll of Anuj : " + rollAnuj);

        System.out.println(students.get("Vivek")); // since it is not in HashMap so it will return null

        // containsKey - O(1)
        System.out.println(students.containsKey("Nish")); // false

        // remove - O(1)
        int rollAdarsh = students.remove("Adarsh"); // it is removed and value is returned
        System.out.println(rollAdarsh);

        // size
        @SuppressWarnings("unused")
        int size = students.size();

        // isEmpty
        students.clear(); // clears HashMap
        System.out.println(students.isEmpty());// true

    }

}
