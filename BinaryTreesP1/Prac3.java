package Java_Learning.BinaryTreesP1;

//height of a binary tree

public class Prac3 {
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

    //func to cal height
    public static int height(Node root){
        if (root == null) {
            return 0;
        }

        int lh = height(root.left); //left child height
        int rh = height(root.right); // right child height
        
        return Math.max(lh, rh) + 1;
    }

    // main func
    public static void main(String[] args) {
        /*
         *          1
         *         / \
         *        2   3
         *       / \ / \
         *      4  5 6  7
         * 
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);

         root.left.left = new Node(4);
         root.left.right = new Node(5);

         root.right.left = new Node(6);
         root.right.right = new Node(7);

         System.out.println("Height : "+height(root));
    }

}