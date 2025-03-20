package Java_Learning.linkedListP2.pracQues;

/* 
    Swapping Nodes in a Linked List

    Sample Input 1 : 1->2->3->4,  x = 2, y = 4
    Sample Output 1 : 1->4->3->2
 */

// Time Complexity  : O(n)
// Space Complexity : O(1)

class Prac3 {
    Node head;

    // Function to swap nodes
    public void swapNodes(int x, int y) {
        if (x == y) {
            return; // same key, no need to swap
        }

        // Searching for x, while keeping track of its previous node
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // Searching for y, while keeping track of its previous node
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return; // x or y missing, swapping not possible
        }

        // Update previous node's next pointer to point to the swapped node
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY; // If x was head, y becomes new head
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX; // If y was head, x becomes new head
        }

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // Function to insert a node at the beginning
    public void push(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    // Function to print the linked list
    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + "->");
            tNode = tNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Prac3 llist = new Prac3();

        // Adding elements to linked list
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("Linked list before swap: ");
        llist.printList();

        // Swapping nodes 4 and 3
        llist.swapNodes(3, 7);

        System.out.print("Linked list after swap: ");
        llist.printList();
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
