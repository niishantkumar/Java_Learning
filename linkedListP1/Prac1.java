package Java_Learning.linkedListP1;

import java.util.NoSuchElementException;

public class Prac1 {

    public static void main(String[] args) {
        LinkedList sll = new LinkedList();

        sll.insertFront(2);
        sll.insertFront(1);
        sll.insertEnd(3);
        sll.insertEnd(4);
        sll.insertMiddle(2, 8);

        sll.print();
        System.out.println("Size of linked list is : " + sll.getSize());

        sll.removeFirst();
        sll.print();
        System.out.println("Size of linked list is : " + sll.getSize());

        sll.removeLast();
        sll.print();
        System.out.println("Size of linked list is : " + sll.getSize());

        System.out.println("3 found at index: " + sll.iterativeSearch(3));
        System.out.println("2 found at index: " + sll.recursiveSearch(2));

        sll.reverseLinkedList();
        sll.print();
        System.out.println("Size of linked list is : " + sll.getSize());
    }
}

class LinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    /**************** ADD NODE ***************/

    public void insertFront(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void insertMiddle(int pos, int data) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            insertFront(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    /*********** REMOVE NODE ****************/

    public int removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException("LinkedList is empty");
        }

        int value = head.data;
        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return value;
    }

    public int removeLast() {
        if (size == 0) {
            throw new NoSuchElementException("LinkedList is empty");
        }

        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int value = tail.data;
        prev.next = null;
        tail = prev;
        size--;

        return value;
    }

    /********** SEARCHING IN A LINKED LIST **************/

    public int iterativeSearch(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    private int recursiveHelper(Node temp, int key) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return 0;
        }

        int index = recursiveHelper(temp.next, key);

        return (index == -1) ? -1 : index + 1;
    }

    public int recursiveSearch(int key) {
        return recursiveHelper(head, key);
    }

    /********** REVERSE LINKED LIST **************/

    public void reverseLinkedList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        tail = head;
        head = prev;
    }

    /********** PRINT LINKED LIST **************/

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}