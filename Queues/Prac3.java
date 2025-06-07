package Java_Learning.Queues;

//implementing Queue using linkedList

public class Prac3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // empty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.print("QQueue is empty");
                return -1;
            }

            int front = head.data;
            if (head == tail) { // if only one element
                tail = head = null;
            } else {
                head = head.next;
            }

            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.print("QQueue is empty");
                return -1;
            }

            int front = head.data;
            return front;
        }

        // print
        public static void print() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return;
            }

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q1 = new Queue();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println("Front = " + q1.peek());
        q1.print();
        System.out.println("After removing front :");
        q1.remove();
        q1.print();
    }

}
