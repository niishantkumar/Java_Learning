package Java_Learning.linkedListP1;

//to delete nth node from end
//tc : O(n)  sc : O(1)

public class Prac3 {
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

    Node head;
    Node tail;

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
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node dummy = new Node(0); // Dummy node to handle edge cases
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                System.out.println("n is larger than the size of the list.");
                return;
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the target node
        slow.next = slow.next.next;

        head = dummy.next; // Update head if first node was deleted
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