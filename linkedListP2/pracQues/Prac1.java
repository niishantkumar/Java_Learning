package Java_Learning.linkedListP2.pracQues;

//Intersection of Two Linked Lists
/*
 In a system there are two singly linkedlist. By some programming error,the end node of one of the linked lists got linked to the second list,
 forming an inverted Y-shaped list.
 
 Write a program to get the point where two linked lists merge.

 */
public class Prac1 {

    public static void main(String[] args) {

        LinkedList sll1 = new LinkedList();

        sll1.addNode(1);
        sll1.addNode(2);
        sll1.addNode(3);
        sll1.addNode(6);
        sll1.addNode(7);

        LinkedList sll2 = new LinkedList();

        sll2.addNode(4);
        sll2.addNode(5);

        LinkedList.Node temp = sll1.nodeAt(3);

        sll2.tail.next = temp;

        sll2.print();
        sll1.print();

        if (intersection(sll1, sll2) == null) {
            System.out.println("Not intersecting");
        } else {
            System.out.println("Intersecting at : " + intersection(sll1, sll2).data);
        }

    }

    // func to find intersecting point of two linkedlist
    static LinkedList.Node intersection(LinkedList sll1, LinkedList sll2) {

        LinkedList.Node head1 = sll1.head;
        LinkedList.Node head2 = sll2.head;

        while (head1 != null) {
            head2 = sll2.head;
            while (head2 != null) {
                if (head1 == head2) {
                    return head1;
                }

                head2 = head2.next;
            }

            head1 = head1.next;
        }

        return null;
    }

}

class LinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // func to add node in LinkedList
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

    // func for size
    int size() {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // func to return node at a particular position
    Node nodeAt(int pos) {
        if (pos == 0) {
            return head;
        }
        if (pos < 0 || pos > size()) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }

        return temp;
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