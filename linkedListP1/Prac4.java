package Java_Learning.linkedListP1;

//to check if the LinkedList is a palidrome

public class Prac4 {

    public static void main(String[] args) {
        LinkedList sll = new LinkedList();

        sll.addNode(1);
        sll.addNode(2);
        sll.addNode(2);
        sll.addNode(1);

        sll.print();

        System.out.println(sll.isPalindrome());
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

    // func to find middle node (slow-fast approach)
    Node findMid() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // one step forward
            fast = fast.next.next; // two step forward
        }

        return slow; // slow is midNode
    }

    // func to check if LinkedList is a palindrome
    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step1 - find mid
        Node midNode = findMid();

        // step2 - reverse 2nd half
        Node curr = midNode;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step3 - check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
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