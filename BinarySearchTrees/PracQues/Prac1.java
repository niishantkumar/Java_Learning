package Java_Learning.BinarySearchTrees.PracQues;

/*
------Range Sum of BST------
 * We have a Binary Search Tree consisting of N nodes and two positive integers L and R,
 * the task is to find the sum of values of all the nodes that lie in the range [L, R]..
 */

public class Prac1 {

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

    // func to find sum of nodes having val in range [L,R]

    public static int sumInRange(Node root, int l, int r) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // If root is in range, add it
        if (root.data >= l && root.data <= r) {
            sum += root.data;
        }

        // If root is greater than L, left subtree might have nodes in range
        if (root.data > l) {
            sum += sumInRange(root.left, l, r);
        }

        // If root is less than R, right subtree might have nodes in range
        if (root.data < r) {
            sum += sumInRange(root.right, l, r);
        }

        return sum;
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

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 5, 3, 6, 8, 11, 20 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println();

        int l = 5;
        int r = 11;

        System.out.println("Sum in range " + l + "," + r + " = " + sumInRange(root, 5, 11));
    }
}
