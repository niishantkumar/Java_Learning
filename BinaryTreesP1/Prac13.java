package Java_Learning.BinaryTreesP1;

//lowest common ancestor (Approach 2)

public class Prac13 {

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

        if (root.data == n1 || root.data == n2) { // if root is the ancestor
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

        Node lca1 = lca(root, 4, 5);
        Node lca2 = lca(root, 4, 6);
        Node lca3 = lca(root, 6, 8);

        System.out.println("LCA of 4 & 5: " +lca1.data);
        System.out.println("LCA of 4 & 6: " +lca2.data);
        System.out.println("LCA of 6 & 8: " + lca3.data);
    }
}