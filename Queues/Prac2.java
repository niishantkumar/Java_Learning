package Java_Learning.Queues;

//circular queue
public class Prac2 {

    static class Queue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // func to add element
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (front == -1) {
                front = 0; // add 1st element
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // func to remove element
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            // last element delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

        public static void print() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % size;
            }
        }

    }

    // main func
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q1 = new Queue(4);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        q1.print();

    }

}