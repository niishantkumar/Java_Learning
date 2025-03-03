package Java_Learning.linkedListP2;

//detect a loop/cycle in a linkedList 
//Floyd's cycle finding algorithm

class Prac1 {

    public static void main(String[] args) {

        LinkedList sll = new LinkedList();

        sll.cycle();

        System.out.println(sll.isCycle());
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

    private Node head;
    private Node tail;

    // func to add node in LinkedList
    void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // func to form cyclic linkedList
    void cycle() {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
    }

    // func to detect a cycle in linkedList
    boolean isCycle() {

        Node slow = head;
        Node fast = head;

        // detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next; // one step forward
            fast = fast.next.next; // two step forward

            if (fast == slow) {
                return true;// cycle exists
            }
        }

        return false;// cycle does not exist
    }
}