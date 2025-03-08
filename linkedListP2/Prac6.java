package Java_Learning.linkedListP2;

//creation of double LinkedList

public class Prac6 {

    public static void main(String[] args) {
        LinkedList dll = new LinkedList();

        dll.addFront(2);
        dll.addFront(1);
        dll.addEnd(3);
        dll.addEnd(4);
        dll.addEnd(5);

        dll.print();

        dll.removeFirst();
        dll.print();

        dll.removeLast();
        dll.print();

        dll.reverse();
        dll.print();
    }

}

class LinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    // func to calc size
    int size() {
        int size = 0;

        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    /************ ADD NODE *************/

    // func to add Node at front
    void addFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // func to add Node at end
    void addEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            addFront(data);
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // func to add node in middle
    public void insertMiddle(int pos, int data) {
        if (pos < 0 || pos > size()) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) { // Insert at the front
            addFront(data);
            return;
        }

        if (pos == size()) { // Insert at the end
            addEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    /************ REMOVE NODE ***************/

    // func to remove 1st node
    void removeFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.next == null) { // if only one node
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // func to remove last node
    void removeLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.next == null) { // if only one node
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    /*********** REVERSE DLL *************/
    void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        tail = head;
        head = prev;
    }

    // func to print dll
    void print() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}