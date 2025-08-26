package Java_Learning.BinarySearchTrees;

//Delete a node in BST

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

    // func to dalete a Node in BST
    public static Node delete(Node root, int val) {

        if (root.data > val) {
            root.left = delete(root.left, val);
        }

        else if (root.data < val) {
            root.right = delete(root.right, val);
        }

        else {
            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - both children exist
            Node IS = findIS(root.right); // IS -> Inorder Successor
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    // func to find Inorder Successor
    public static Node findIS(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
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

        root = delete(root, 3);

        inorder(root);
    }
}
