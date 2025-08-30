package Java_Learning.BinarySearchTrees;

import java.util.ArrayList;

// validate a Binary Search Tree

//Approach ! -> Get inorder traversal and if it is sorted, then BST is valid

public class Prac6 {

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

    // func to check if BST is valid or not
    public static boolean isValid(Node root) {

        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return isSorted(list);

    }

    // isValid Helper
    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    // func to check whether sorted
    public static boolean isSorted(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) { // BST does not allow dulicate values
                return false;
            }
        }

        return true;
    }

    // func to build BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if (isValid(root)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }

}