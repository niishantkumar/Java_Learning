package Java_Learning.Queues;

//implementing Queue using Array

public class Prac1 {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];

            // loop to remove element from arr
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }

        public static void printQueue() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i]);
            }
        }

    }

    // main func
    public static void main(String[] args) {
        Queue q1 = new Queue(4);
        q1.add(0);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(0);

        q1.printQueue();
    }

}
