package Java_Learning.ArrayList.pracQues;

//Lonely ques
//optimized method

import java.util.ArrayList;
import java.util.Collections;;

public class Prac3 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        LonelyNumbers obj = new LonelyNumbers();
        ArrayList<Integer> result = obj.findLonely(nums);
        System.out.println("Lonely numbers: " + result);
    }

}

class LonelyNumbers {
    ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums); // Sort the array
        ArrayList<Integer> list = new ArrayList<>();

        // Check for lonely numbers in the middle of the sorted list
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }

        // Special cases: If the list has only one element, it's lonely by default
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }

        // Check for loneliness at the start and end of the list
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }

        return list;
    }

}