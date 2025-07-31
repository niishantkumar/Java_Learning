package Java_Learning.BinaryTreesP1;

import java.util.LinkedList;
import java.util.Queue;

//kth level traversal (Approach 1)

public class Prac10 {
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

    public static void nthLevelNodes(Node root, int level) {
        Queue<Node> q = new LinkedList<>();
        int levelCount = 1;
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    levelCount++;
                    q.add(null);
                }
            } else {
                if (levelCount == level) {
                    System.out.print(curr.data + " ");
                }

                if (levelCount > level) {
                    break;
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
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

        nthLevelNodes(root, 3);
    }
}