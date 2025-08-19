package Java_Learning.BinaryTreesP1.PracQues;

/*
 * Problem: Invert Binary Tree (Mirror of a Tree)
 * 
 * The mirror of a binary tree is another tree where the left and right children of every non-leaf node are swapped.
 */

public class Prac2 {
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

    //func to invert binary tree
    private static void invertTree(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
    }


    //preorder traversal
    public static void preorder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        /*
         *    1
         *   / \
         *  2   3
         * / \ / \
         * 4 5 6  7
         * 
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left =new Node(4);
         root.left.right = new Node(5);
         root.right.left =new Node(6);
         root.right.right =new Node(7);

         invertTree(root);
         preorder(root);
    }
}