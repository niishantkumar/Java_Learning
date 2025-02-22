package Java_Learning.linkedListP1;

//to delete nth node from end

public class Prac2 {
    public static void main(String[] args) {

        LinkedList sll = new LinkedList();

        sll.addNode(1);
        sll.addNode(2);
        sll.addNode(3);
        sll.addNode(4);

        sll.print();

        System.out.println(sll.size());

        sll.deleteNthFromEnd(2);

        sll.print();

    }

}

class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    // func to calc size of linkedList
    int size() {
        Node temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // if nodes are there in linked list
        tail.next = newNode;
        tail = newNode;
    }

    // func to delete nth node from end
    void deleteNthFromEnd(int n) {
        int size = size();

        if (n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int indTofind = size - n;
        Node prev = head;
        while (i < indTofind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    // func to print linkedList
    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");

    }
}