package Java_Learning.linkedListP2.pracQues;

/*
    Merge k Sorted Lists
    We have K sorted linked lists of size N each, merge them and print the sorted output.

    Sample Input 1 : k = 2, n =  2
    l1 = 1->3->NULL
    l2 = 6->8->NULL
    l3 = 9->10->NULL
    Sample Output 1 : 1>3->6->8->9->10->NULL

 */

class Prac5 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    private static Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Attach remaining elements
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }

    // Function to merge K sorted linked lists using Divide and Conquer
    public static Node mergeKLists(Node[] lists, int left, int right) {
        if (left > right) return null;
        if (left == right) return lists[left];

        int mid = left + (right - left) / 2;

        Node leftMerged = mergeKLists(lists, left, mid);
        Node rightMerged = mergeKLists(lists, mid + 1, right);

        return mergeTwoLists(leftMerged, rightMerged);
    }

    // Function to print a linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Creating the K linked lists
        Node l1 = new Node(1);
        l1.next = new Node(8);

        Node l2 = new Node(2);
        l2.next = new Node(5);

        Node l3 = new Node(3);
        l3.next = new Node(10);

        // Storing them in an array
        Node[] lists = { l1, l2, l3 };

        System.out.println("Merged Sorted List:");
        Node mergedHead = mergeKLists(lists, 0, lists.length - 1);
        printList(mergedHead);
    }
}
