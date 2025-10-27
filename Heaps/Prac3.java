package Java_Learning.Heaps;

import java.util.ArrayList;

//minHeap implementation

public class Prac3 {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // func to add element in heap
        public void add(int data) { // O(log n)
            // add at the end
            arr.add(data);

            int x = arr.size() - 1;// index of data inserted
            int par = (x - 1) / 2; // ind of data's parent

            while (arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // func to peek last element from heap
        public int peek() { // O(1)
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minInd = i;

            if (left < arr.size() && arr.get(minInd) > arr.get(left)) {
                minInd = left;
            }

            if (right < arr.size() && arr.get(minInd) > arr.get(right)) {
                minInd = right;
            }

            if (minInd != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minInd));
                arr.set(minInd, temp);

                heapify(minInd);
            }
        }

        // funnc to remove ele from heap
        public int remove() { // O(log n)
            int data = arr.get(0);

            // step1 - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step2 - delete last
            arr.remove(arr.size() - 1);

            // step3 - heapify
            heapify(0);

            return data;
        }

        // isEmpty
        public boolean isEmpty() {
            return arr.isEmpty();
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(1);
        h.add(4);
        h.add(2);
        h.add(5);
        h.add(3);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
