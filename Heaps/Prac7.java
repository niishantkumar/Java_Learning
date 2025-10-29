package Java_Learning.Heaps;

import java.util.PriorityQueue;

//Nearby cars

public class Prac7 {
    static class Car implements Comparable<Car> {
        int x;
        int y;
        int disSqr;
        int carNum;

        public Car(int x, int y, int dis, int carNum) {
            this.x = x;
            this.y = y;
            this.disSqr = dis;
            this.carNum = carNum;
        }

        @Override
        public int compareTo(Car c2) {
            return this.disSqr - c2.disSqr; // ascending
        }
    }

    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } }; // coordinates
        int k = 2;

        PriorityQueue<Car> pq = new PriorityQueue<>();

        for (int i = 0; i < pts.length; i++) {
            int disSqr = (pts[i][0] * pts[i][0]) + (pts[i][1] * pts[i][1]);

            pq.add(new Car(pts[i][0], pts[i][1], disSqr, i + 1)); // last one is car number
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().carNum);
        }

    }

}
