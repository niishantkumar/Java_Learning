package Java_Learning.StackP1;

//creation of Stack using LinkedList

public class Prac2 {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // class for Stack
    static class Stack {
        static Node head = null;

        // func to check if empty
        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }

    }

    // main func
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }

        System.out.println(s1.pop());
    }

}