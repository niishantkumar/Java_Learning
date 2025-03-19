package Java_Learning.linkedListP2.pracQues;
/* 
   Delete N Nodes After M Nodes of a Linked List

   Sample Input : 
   M = 3, N = 2    
   LL: 1->2->3->4->5->6->7->8->9->10
   
   Sample Output : 1->2->3->6->7->8
*/

public class Prac2 {

    // main func
    public static void main(String[] args) {
        LinkedList sll1 = new LinkedList();

        sll1.addNode(1);
        sll1.addNode(2);
        sll1.addNode(3);
        sll1.addNode(4);
        sll1.addNode(5);
        sll1.addNode(6);
        sll1.addNode(7);
        sll1.addNode(8);
        sll1.addNode(9);
        sll1.addNode(10);

        sll1.skipMdeleteN(3, 2);

        sll1.print();
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

    Node head, tail;

    // func to add Node
    void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    // func to Delete N Nodes After M Nodes
    void skipMdeleteN(int m, int n) {
        Node traverse = head;

        while (traverse != null) {
            // Skip M nodes
            for (int i = 1; i < m && traverse != null; i++) {
                traverse = traverse.next;
            }

            // If we've reached the end, stop
            if (traverse == null || traverse.next == null)
                return;

            // Start deleting N nodes
            Node temp = traverse.next; // Start from the first node to be deleted
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }

            // Link the last node of M-segment to the node after N deletions
            traverse.next = temp;
            traverse = temp; // Move traverse to the next segment
        }
    }

    // func to print dll
    void print() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}