package Assignment5.Module12;

public class InorderTraversal {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        inorder(root);
    }
}
