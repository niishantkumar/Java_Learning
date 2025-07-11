package Java_Learning.BinaryTreesP1;

//preoder traversal

import java.util.Queue;
import java.util.LinkedList;

public class Prac2 {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // preorder traversal
        public static void preorder(Node root) {

            if (root == null) {
                System.out.print("-1 ");
                return;
            }

            System.out.print(root.data + " ");// root
            preorder(root.left);// left child
            preorder(root.right);// right child
        }

        // inorder traversal
        public static void inorder(Node root) {

            if (root == null) {
                return;
            }

            inorder(root.left);// left subtree
            System.out.print(root.data + " ");// root
            inorder(root.right);// right subtree
        }

        // postorder traversal
        public static void postorder(Node root) {

            if (root == null) {
                return;
            }

            postorder(root.left);// left subtree
            postorder(root.right);// right subtree
            System.out.print(root.data + " ");// root

        }

        // level order traversal
        public static void levelorder(Node root) {

            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");

                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    // main func
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.preorder(root);
        System.out.println();
        tree.inorder(root); // 4 2 5 1 3 6
        System.out.println();
        tree.postorder(root); // 4 5 2 6 3 1
        System.out.println();

        tree.levelorder(root); /*
                                * 1
                                * 2 3
                                * 4 5 6
                                */
    }
}