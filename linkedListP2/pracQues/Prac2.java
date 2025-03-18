package Java_Learning.linkedListP2.pracQues;

/* 
   Delete N Nodes After M Nodes of a Linked List

   Sample Input : 
   M = 3, N = 2    
   LL: 1->2->3->4->5->6->7->8->9->10
   
   Sample Output : 1->2->3->6->7->8
*/

public class Prac2 {

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
}