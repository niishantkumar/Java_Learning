package Java_Learning.BinaryTreesP1.PracQues;

// Delete leaf nodes with values as x

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

    // func to delete leaf nodes with value n
    private static Node deleteNodeWith_ValN(Node root, int n) {
        if (root == null) {
            return null;
        }

        root.left = deleteNodeWith_ValN(root.left, n);
        root.right = deleteNodeWith_ValN(root.right, n);

        // delete if this is a leaf with value n
        if (root.data == n && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }

    // preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
         *     1
         *    / \
         *   3   3
         *  / \
         * 3   2
         */

        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        root = deleteNodeWith_ValN(root, 3);

        preorder(root);  //output: 1 3 2
    }
}
