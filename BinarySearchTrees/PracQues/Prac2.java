package Java_Learning.BinarySearchTrees.PracQues;

/*
----------Find the closest element in Binary Search Tree-----------
 * Given a Binary Search Tree and a target value K,
 * Find the node with the minimum absolute difference from K.
 */

public class Prac2 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // To keep track of the closest node found so far
    static Node minDiffNode = null;

    // Function to find the node with the minimum absolute difference to K
    public static int minAbsDiff(Node root, int k) {
        Node curr = root;
        int minDiff = Integer.MAX_VALUE;

        while (curr != null) {
            int currDiff = Math.abs(curr.data - k);

            if (currDiff < minDiff) {
                minDiff = currDiff;
                minDiffNode = curr;
            }

            // Move left or right depending on the value of K
            if (k < curr.data) {
                curr = curr.left;
            } else if (k > curr.data) {
                curr = curr.right;
            } else {
                // Exact match found
                break;
            }
        }

        return minDiff;
    }

    // Insert a new node into the BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder traversal to print BST
    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = { 5, 3, 6, 8, 11, 20 };
        Node root = null;

        // Build the BST
        for (int val : values) {
            root = insert(root, val);
        }

        // Print inorder traversal
        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();

        // Target value
        int k = 10;

        // Reset minDiffNode before finding closest
        minDiffNode = null;

        int closestDiff = minAbsDiff(root, k);

        if (minDiffNode != null) {
            System.out.println("Closest value to " + k + " is: " + minDiffNode.data);
            System.out.println("Minimum absolute difference: " + closestDiff);
        } else {
            System.out.println("Tree is empty.");
        }
    }
}
