package Java_Learning.BinaryTreesP1.PracQues;

// Maximum Path Sum in a Binary Tree

import java.util.HashMap;

public class Prac4 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    // Function to build binary tree from preOrder
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

    static HashMap<String, Integer> m;

    static String inorder(Node node) {
        if (node == null)
            return "";

        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";

        if (m.get(str) != null && m.get(str) == 1)
            System.out.print(str + " ");

        if (m.containsKey(str))
            m.put(str, m.get(str) + 1);
        else
            m.put(str, 1);

        return str;
    }

    static void printAllDups(Node root) {
        m = new HashMap<>();
        inorder(root);
    }

    static int val;

    static int findMaxUtil(Node node) {

        if (node == null)
            return 0;

        // Find max in left subtree
        int l = findMaxUtil(node.left);

        // Find max sum in right subtree
        int r = findMaxUtil(node.right);

        // Find max sum height starting from this node
        int max_single = Math.max(Math.max(l, r) + node.data, node.data);

        // Find max sum path containing this node.
        int max_top = Math.max(max_single, l + r + node.data);

        // Store max path
        val = Math.max(val, max_top);

        // Return max sum height
        return max_single;
    }

    static int findMaxSum(Node node) {

        val = Integer.MIN_VALUE;
        findMaxUtil(node);
        return val;
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = {2, 2, 2, -1, -1, 2, -1, -1, 2, -1, 2, -1, -1 };

        Node root = buildTree(nodes);

        System.out.println("Maximum Path Sum: " + findMaxSum(root));

        System.out.print("Duplicate Subtrees: ");
        printAllDups(root);

    }
}