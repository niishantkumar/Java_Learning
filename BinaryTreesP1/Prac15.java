package Java_Learning.BinaryTreesP1;

//kth ancestor of a node

public class Prac15 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // func to find kth ancestor
    public static int KAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDis = KAncestor(root.left, n, k);
        int rightDis = KAncestor(root.right, n, k);

        if (leftDis == -1 && rightDis == -1) {
            return -1;
        } else if (leftDis == -1) {
            if (rightDis + 1 == k) {
                System.out.println("Kth Ancestor of " + n + " is : " + root.data);
            }

            return rightDis + 1;

        } else {
            if (leftDis + 1 == k) {
                System.out.println("Kth Ancestor of " + n + " is : " + root.data);
            }
            return leftDis + 1;

        }
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

        KAncestor(root, 8, 3);
    }

}