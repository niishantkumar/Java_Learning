package Java_Learning.Hashing;

// iteration on HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prac2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 2);

        // Get the entry set once
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // Iterate over the set
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println("Key : " + key + ", val : " + map.get(key));
        }
    }
}
