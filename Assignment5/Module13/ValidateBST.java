package Assignment5.Module13;

public class ValidateBST {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;
        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);

        System.out.println("Is Valid BST: " +
                isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
