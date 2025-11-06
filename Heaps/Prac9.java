package Java_Learning.Heaps;
//weakest Soldier

import java.util.PriorityQueue;

public class Prac9 {
    static class Row implements Comparable<Row> {
        int soldiers;
        int index;

        public Row(int soldiers, int index) {
            this.soldiers = soldiers;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.index - r2.index;
            }

            return this.soldiers - r2.soldiers;
        }
    }

    public static void main(String[] args) {
        int army[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        int k = 2;

        // pq of rows from weakest to strongest
        PriorityQueue<Row> level = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {

            // to count num of soldier in row i
            int soldierCount = 0;
            for (int j = 0; j < army[0].length; j++) {
                soldierCount += army[0][j] == 1 ? 1 : 0;
            }

            level.add(new Row(soldierCount, i));
        }

        // print k weakest rows
        for (int i = 0; i < k; i++) {
            System.out.println("Row R" + level.remove().index);
        }
    }

}
