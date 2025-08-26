package Java_Learning.BinarySearchTrees;

//Print in range

public class Prac4 {

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

    // Function to print values in the range [k1, k2] in a BST
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // case 1 : k1 <= root <= k2
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        // case 2 : root < k1
        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        }
        // case 3 : root > k2
        else {
            printInRange(root.left, k1, k2);
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

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printInRange(root, 0, 0);
    }
}