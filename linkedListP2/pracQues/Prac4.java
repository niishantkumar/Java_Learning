package Java_Learning.linkedListP2.pracQues;

/*
    --------------Odd Even Linked List---------------------

    We have a Linked List of integers, write a function to modify the linked list such that all even
    numbers appear before all the odd numbers in the modified linked list. Also, keep the order of
    even and odd numbers same.

    Sample Input 1 : 8->12->10->5->4->1->6->NULL
    Sample Output 1 : 8->12->10->4->6->5->1->NULL
 */

public class Prac4 {
    Node head;

    // func to add Node
    void addNode(int data) {
        Node newNode = new Node(data); // adding nodes from last to 1st
        newNode.next = head;
        head = newNode;
    }

    // func to print sll
    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // func to separate even and odd data nodes
    void evenOddList() {
        /*
         * Node temp;
         * Node curr = head;
         * Node evenTracker = null;
         * 
         * while (curr != null) {
         * if (curr.data % 2 == 0) {
         * evenTracker = curr;
         * curr = curr.next;
         * continue;
         * }
         * 
         * while (curr.data % 2 != 0) {
         * curr = curr.next;
         * }
         * 
         * temp = evenTracker.next;
         * evenTracker.next = curr;
         * curr = curr.next;
         * evenTracker.next.next = temp;
         * temp.next = curr;
         * evenTracker = evenTracker.next;
         * }
         * 
         */
        Node temp;
        Node curr = head;
        Node evenTracker = null;
        Node lastOdd = null;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                evenTracker = curr;
                curr = curr.next;
                continue;
            }

            while (curr.data % 2 != 0) {
                lastOdd = curr;
                curr = curr.next;
            }

            temp = evenTracker.next;
            evenTracker.next = curr;
            curr = curr.next;
            evenTracker.next.next = temp;
            if (curr == null) {
                lastOdd.next = curr;
                continue;
            }
            temp.next = curr;
            evenTracker = evenTracker.next;
        }
    }

    // Function to separate even and odd data nodes while maintaining relative order
    void evenOddList1() {
        if (head == null || head.next == null)
            return;

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) { // Even number
                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            } else { // Odd number
                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            curr = curr.next;
        }

        // If no even numbers, do nothing
        if (evenHead == null)
            return;

        // Connect even list to odd list
        evenTail.next = oddHead;

        // Set last odd node's next to null to avoid cycle
        if (oddTail != null) {
            oddTail.next = null;
        }

        // Update head to the new start (evenHead)
        head = evenHead;
    }

    public static void main(String[] args) {

        Prac4 sll = new Prac4();

        sll.addNode(7);
        sll.addNode(5);
        sll.addNode(4);
        sll.addNode(9);
        sll.addNode(0);
        sll.addNode(9);
        sll.addNode(2);
        sll.addNode(5);
        sll.addNode(4);
        sll.addNode(3);

        sll.print();

        sll.evenOddList1();

        sll.print();
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}