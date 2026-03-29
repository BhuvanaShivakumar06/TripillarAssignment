package Assignment5.Module12;



public class PreTraversal {
    int data;// the data of the node
    PreTraversal left;// The address of the left child
    PreTraversal right;// The address of the right child
    PreTraversal(int data){
        this.data = data;
        this.left = this.right=null; //Initially Node has No children
    }
    public static void preOrder(PreTraversal root){// DLR
        if (root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        //Construct the binary Tree
        // we must construct the tree from
        // top to bottom,left to right,level by level
        //Level 0
        PreTraversal root = new PreTraversal(1);
        //level 1

        root.left = new PreTraversal(2);
        root.right = new PreTraversal(3);
        //level 2
        root.left.left = new PreTraversal(4);
        root.left.right = new PreTraversal(5);
        root.right.left = new PreTraversal(6);
        root.right.right = new PreTraversal(7);
        //level 3
        root.left.right.left = new PreTraversal(9);
        root.right.right.left = new PreTraversal(15);
        System.out.println("PreOrder Traversal");
        preOrder(root);
    }
}
