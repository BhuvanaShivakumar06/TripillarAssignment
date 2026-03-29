package Assignment5.Module13;

public class BSTMinMax {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insert(root.left, key);
        else root.right = insert(root.right, key);
        return root;
    }

    static int findMin(Node root) {
        while (root.left != null) root = root.left;
        return root.data;
    }

    static int findMax(Node root) {
        while (root.right != null) root = root.right;
        return root.data;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] keys = {5, 3, 7, 2, 8};

        for (int k : keys)
            root = insert(root, k);

        System.out.println("Min: " + findMin(root));
        System.out.println("Max: " + findMax(root));
    }
}
