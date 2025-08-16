package Java_Learning.BinaryTreesP1;

//kth ancestor of a node (Approach 1)

public class Prac16 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int ans = -1;

    public static int KAncestor(Node root, int n, int k) {
        if (root == null)
            return -1;

        if (root.data == n)
            return 0;

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        int currDist = Math.max(leftDist, rightDist);
        if (currDist != -1 && currDist + 1 == k && ans == -1) {
            ans = root.data;
        }

        return (currDist == -1) ? -1 : currDist + 1;
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

        int k = 3;
        int target = 8;
        KAncestor(root, target, k);

        if (ans != -1) {
            System.out.println("Kth ancestor of " + target + " is: " + ans);
        } else {
            System.out.println("Ancestor not found.");
        }
    }
}
