package Java_Learning.BinaryTreesP1;

//minimum distance between two nodes

public class Prac14 {
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

    public static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (leftLca == null) {
            return rightLca;
        }

        if (rightLca == null) {
            return leftLca;
        }

        return root;
    }

    // helper func for minDistance()
    public static int minDis(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) { // if root is the node itself then dis = 0
            return 0;
        }

        int leftDis = minDis(root.left, n); // find in left
        int rightDis = minDis(root.right, n); // find in right

        if (leftDis == -1 && rightDis == -1) { // if not in left & right
            return -1;
        } else if (leftDis == -1) { // if not in left, return right
            return ++rightDis;
        } else {
            return ++leftDis; // else return left
        }
    }

    // func to find minimum distance between two nodes
    public static int minDistance(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);

        int dis1 = minDis(lca, n1); // dis of 1st node from lca
        int dis2 = minDis(lca, n2); // dis of 2nd node from lca

        return dis1 + dis2;
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

        System.out.println(minDistance(root, 4, 8));
    }
}
