package Java_Learning.BinaryTreesP1;

// Subtree of another tree

public class Prac8 {
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

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(root.right, subRoot.right)) {
            return false;
        }
        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {

        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) { // root node matched
            if (isIdentical(root, subRoot)) { // now check for remaining nodes
                return true;
            }
        }

        // check if subtree exist in right/left part of main tree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // main func
    public static void main(String[] args) {
        /*
             1
            / \
           2   3
          / \ / \
         4  5 6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
            2
           / \
          4   5
         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}