package Java_Learning.BinaryTreesP1;

//diameter of a tree (optimized approach) O(n)

public class Prac7 {
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

    // func to cal height
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left); // left child height
        int rh = height(root.right); // right child height

        return Math.max(lh, rh) + 1;
    }

    static class Info {
        int diam; // diameter
        int ht; // height

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0); // since, at leaf ht = 0 & diam = 0
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    // main func
    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * \
         * 8
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.right.right.right = new Node(8);

        System.out.println("Diameter : " + diameter(root).diam);
    }
}
