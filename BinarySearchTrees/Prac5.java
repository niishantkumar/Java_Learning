package Java_Learning.BinarySearchTrees;

import java.util.ArrayList;

// root to leaf path

public class Prac5 {

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

    // func to print root to leaf path
    public static void rootToLeafPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data); // add when node comes in path

        if (root.left == null && root.right == null) {
            print(path);
        } else {
            rootToLeafPath(root.left, path);
            rootToLeafPath(root.right, path);
        }

        // remove when backtracking
        path.remove(path.size() - 1);
    }

    // print ArrayList
    public static void print(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        rootToLeafPath(root, new ArrayList<>());
    }

}
