package Java_Learning.BinaryTreesP1;

import java.util.ArrayList;

//kth ancestor of a node (Approach 2)

public class Prac17 {
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

    // this func prints kth ancestor as soon as it finds it
    public static int kthAncestor(Node root, int k, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftFound = kthAncestor(root.left, k, n);
        int rightFound = kthAncestor(root.right, k, n);

        if (leftFound != -1) {
            if (leftFound + 1 == k) {
                System.out.println("Ancestor: " + root.data);
            }
            return leftFound + 1;
        }

        if (rightFound != -1) {
            if (rightFound + 1 == k) {
                System.out.println("Ancestor: " + root.data);
            }
            return rightFound + 1;
        }

        return -1;
    }

    // this func returns the ArrayList containing all the ancestors of Node n
    public static boolean ancestors(Node root, int n, ArrayList<Integer> arr) {
        if (root == null) {
            return false;
        }

        arr.add(root.data);

        if (root.data == n) {
            return true;
        }

        boolean leftFound = ancestors(root.left, n, arr);
        boolean rightFound = ancestors(root.right, n, arr);

        if (leftFound || rightFound) {
            return true;
        }

        arr.remove(arr.size() - 1);

        return false;
    }

    public static void main(String[] args) {
          /*
             1
            / \
           2   3
          / \ / \
         4  5 6  7
                  \
                   8
         */
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);

        int k = 2;

        ArrayList<Integer> path = new ArrayList<>();
        ancestors(root, 4, path);
        System.out.println("Ancestor : " + path.get(path.size() - k - 1));

        kthAncestor(root, k, 8);

    }
}