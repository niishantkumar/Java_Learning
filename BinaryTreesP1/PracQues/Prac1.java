package Java_Learning.BinaryTreesP1.PracQues;

/* 
 * Check if a Binary Tree is univalued or not 
 * We have a binary tree, the task is to check if the binary tree is univalued or not.
 * If found to be true, then print “YES”. Otherwise, print “NO”
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

    //helper func
    static boolean isUnivalTree(Node root) {
        if (root == null)
            return true;
        return isUnivalued(root, root.data);
    }

    //func to check univalued
    private static boolean isUnivalued(Node root, int data) {
        if (root == null) {
            return true;
        }

        if (root.data != data) {
            return false;
        }

        boolean leftCheck = isUnivalued(root.left, data);
        boolean rightCheck = isUnivalued(root.right, data);

        return leftCheck && rightCheck;
    }

    public static void main(String[] args) {
        /*
         *    2
         *   / \
         *  2   2
         * / \ / \
         * 5 2 2  2
         * 
         */

         Node root = new Node(2);
         root.left = new Node(2);
         root.right = new Node(2);
         root.left.left =new Node(5);
         root.left.right = new Node(2);
         root.right.left =new Node(2);
         root.right.right =new Node(2);

         isUnivalTree(root);
    }

}