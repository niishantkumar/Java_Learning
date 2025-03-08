package Java_Learning.linkedListP2;

//creation of double LinkedList

public class Prac6 {

    public static void main(String[] args) {
        LinkedList dll = new LinkedList();

        dll.addFront(2);
        dll.addFront(1);
        dll.addEnd(3);
        dll.addEnd(4);
        dll.addEnd(5);

        dll.print();

        dll.removeFirst();

        dll.print();

        dll.removeLast();

        dll.print();
    }
    
}

class LinkedList{
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    /************ADD NODE*************/

    //func to add Node at front
    void addFront(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //func to add Node at end
    void addEnd(int data){
        Node newNode = new Node(data);

        if (head == null) {
            addFront(data);
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /************REMOVE NODE***************/

    //func to remove 1st node
    void removeFirst(){
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.next == null) { //if only one node
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    //func to remove last node
    void removeLast(){
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.next == null) { //if only one node
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    //func to print dll
    void print(){
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}