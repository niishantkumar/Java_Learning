package Java_Learning.BinaryTreesP1;

import java.util.ArrayList;

//lowest common ancestor (Approach 1)

public class Prac12 {

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

    public static boolean pathToN(Node root, int n, ArrayList<Node> path) {

        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundInLeft = pathToN(root.left, n, path);
        boolean foundInright = pathToN(root.right, n, path);

        if (foundInLeft || foundInright) { // if exist in left/right subree then root is part of path
            return true;
        }

        path.remove(path.size() - 1); // else remove root

        return false;
    }

    public static Node lowestCommon_ancestor(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        pathToN(root, n1, path1);
        pathToN(root, n2, path2);

        // last common ancestro
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        // last equal node -> i-1
        return path1.get(i - 1);
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

        Node lca1 = lowestCommon_ancestor(root, 4, 5);
        Node lca2 = lowestCommon_ancestor(root, 4, 6);
        Node lca3 = lowestCommon_ancestor(root, 6, 8);

        System.out.println("LCA of 4 & 5: " +lca1.data);
        System.out.println("LCA of 4 & 6: " +lca2.data);
        System.out.println("LCA of 6 & 8: " + lca3.data);

    }
}