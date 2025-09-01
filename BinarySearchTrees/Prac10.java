package Java_Learning.BinarySearchTrees;

import java.util.ArrayList;

//BST to balanced BST

public class Prac10 {

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

    // inorder traversal of BST
    public static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    // func to create balanced BST
    public static Node balancedBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = balancedBST(arr, start, mid - 1);
        root.right = balancedBST(arr, mid + 1, end);

        return root;
    }

    // func to convert BST to balanced BST
    public static Node toBAlanceBST(Node root) {

        if (root == null) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return balancedBST(list, 0, list.size() - 1);
    }

    // print
    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        Node newRoot = toBAlanceBST(root);

        System.out.println("Inorder of Balanced BST:");
        printInorder(newRoot);

    }
}
