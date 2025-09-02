package Java_Learning.BinarySearchTrees;

import java.util.ArrayList;

//merge two BSTs

public class Prac12 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Inorder traversal to get sorted elements from BST
    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    // Build balanced BST from sorted array
    public static Node balanceBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;

        Node root = new Node(arr.get(mid));

        root.left = balanceBST(arr, start, mid - 1);
        root.right = balanceBST(arr, mid + 1, end);

        return root;
    }

    // Merge two BSTs into one balanced BST
    public static Node mergeBST(Node root1, Node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inorder(root1, list1);
        inorder(root2, list2);

        // Merge the two sorted lists
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }

        // Add remaining elements
        while (i < list1.size())
            merged.add(list1.get(i++));
        while (j < list2.size())
            merged.add(list2.get(j++));

        // Build and return balanced BST from merged list
        return balanceBST(merged, 0, merged.size() - 1);
    }

    // print tree
    public static void print(Node root) {
        if (root == null)
            return;

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public static void main(String[] args) {

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root3 = mergeBST(root1, root2);

        print(root3);
    }

}
