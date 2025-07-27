package Java_Learning.BinaryTreesP1;

//diameter of a tree O(n^2)  (approach 1)

public class Prac6 {
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

    //func to cal height
    public static int height(Node root){
        if (root == null) {
            return 0;
        }

        int lh = height(root.left); //left child height
        int rh = height(root.right); // right child height
        
        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHeight = height(root.right);
        
        int selfDiam = leftHeight + rightHeight + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    // main func
    public static void main(String[] args) {
        /*
         *          1
         *         / \
         *        2   3
         *       / \ / \
         *      4  5 6  7
         *               \
         *                8
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);

         root.left.left = new Node(4);
         root.left.right = new Node(5);

         root.right.left = new Node(6);
         root.right.right = new Node(7);

         root.right.right.right = new Node(8);


         System.out.println("Diameter : "+diameter(root));
    }
}
