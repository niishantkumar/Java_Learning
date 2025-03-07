package Java_Learning.linkedListP2;

public class Prac5 {
    public static void main(String[] args) {
        LinkedList sll = new LinkedList();

        sll.addNode(1);
        sll.addNode(2);
        sll.addNode(3);
        sll.addNode(4);
        sll.addNode(5);

        sll.print();

        sll.zigZagSll();

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

    // func to add node
    void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    //func for zig zag sll
    void zigZagSll(){
        //step1 : find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; //one step
            fast = fast.next.next; // two step
        }

        Node mid = slow;

        //step2 : reverse 2nd part
        Node prev = null;
        Node curr = mid.next; 
        mid.next = null; //split sll into two parts
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step3 : zig-zag merge 
        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight;

        while(left != null && right != null){
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }

    // func to print sll
    void print() {
        if (head == null) {
            System.out.println("Empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

}