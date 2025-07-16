package Java_Learning.BinaryTreesP1;

//count of nodes of a tree

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

    // func to count nodes
    public static int nodeCount(Node root) {
        if (root == null) {
            return 0;
        }

        int ln = nodeCount(root.left); // left subtree nodes
        int rn = nodeCount(root.right); // right subtree nodes

        return ln + rn + 1;
    }

    // main func
    public static void main(String[] args) {
        /*
         *    1
         *   / \
         *  2   3
         * / \ / \
         * 4 5 6 7
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Total nodes : " + nodeCount(root));
    }
}
