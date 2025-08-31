package Java_Learning.BinarySearchTrees;

// Sorted Array to Balanced BST

public class Prac9 {

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

    // func to build Balanced BST from Sorted Array
    public static Node balancedBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);
        root.left = balancedBST(arr, start, mid - 1);
        root.right = balancedBST(arr, mid + 1, end);

        return root;
    }

    // preorder
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = balancedBST(arr, 0, arr.length - 1);

        preorder(root);

    }

}