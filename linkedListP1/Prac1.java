package Java_Learning.linkedListP1;

public class Prac1 {

    public static void main(String[] args) {
        LinkedList sll = new LinkedList();

        sll.insertFront(2);
        sll.insertFront(1);
        sll.insertENd(3);
        sll.insertENd(4);
        sll.InsertMiddle(2, 8);

        LinkedList.print();
        System.out.println("Size of linked list is : " + LinkedList.size);

        sll.removeFirst();
        LinkedList.print();
        System.out.println("Size of linked list is : " + LinkedList.size);

        sll.removeLast();
        LinkedList.print();
        System.out.println("Size of linked list is : " + LinkedList.size);

        System.out.println("3 found at " + sll.itrSearch(3));
        System.out.println("2 found at " + sll.recurSearch(2));

        sll.revsLinkedList();
        LinkedList.print();
    }

}

class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static int size;

    /**************** ADD NODE*************** */

    // func to add node at front
    void insertFront(int data) { // O(1)
        // creating new node
        Node newNode = new Node(data);
        size++;

        // if linkedList if empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // if nodes are there in linked list
        newNode.next = head;
        head = newNode;
    }

    // func to add node at end
    void insertENd(int data) { // O(1)
        // creating new node
        Node newNode = new Node(data);
        size++;

        // if linkedList if empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // if nodes are there in linked list
        tail.next = newNode;
        tail = newNode;
    }

    // func to insert in the middle
    void InsertMiddle(int pos, int data) {

        if (pos == 0) {
            insertFront(data);
            return;
        }

        // create new Node
        Node newNode = new Node(data);
        size++;

        Node temp = head;

        int i = 0;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    /*********** REMOVE NODE ****************/

    // func to remove 1st node
    int removeFirst() {

        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE; // just to show that sll is empty and no valid value exists in it
        }

        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;

            return value;
        }

        int value = head.data;
        head = head.next;
        size--;

        return value;

    }

    // func to remove lst node
    int removeLast() {

        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE; // just to show that sll is empty and no valid value exists in it
        }

        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;

            return value;
        }

        // prev ind = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int value = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;

        return value;

    }

    /********** SEARCHING IN A LINKED LIST **************/

    // func for iterative search
    int itrSearch(int key) {

        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    // func for recursive search
    // helper function
    int helper(Node temp, int key) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return 0;
        }

        int ind = helper(temp.next, key);

        if (ind == -1) {
            return -1;
        }

        return ind + 1;

    }

    int recurSearch(int key) {
        return helper(head, key);
    }

    /********** REVERSE LINKED LIST **************/
    void revsLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // func to print Linked List
    static void print() { // O(n)
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}