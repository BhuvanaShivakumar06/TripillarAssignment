package Assignment5.Module13;

public class BstSearch {
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

    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 5);
        insert(root, 3);
        insert(root, 7);

        System.out.println("Search 3: " + search(root, 3));
    }

}
