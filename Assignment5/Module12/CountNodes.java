package Assignment5.Module12;

public class CountNodes {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int count(Node root) {
        if (root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Node Count: " + count(root));
    }
}
