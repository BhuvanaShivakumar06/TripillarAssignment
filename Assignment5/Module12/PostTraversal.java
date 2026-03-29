package Assignment5.Module12;

import com.advan.dsa.dataStructures.nonliner.Trees.traversals.dfs.Node;

public class PostTraversal {
    int data;// the data of the node
    PostTraversal left;// The address of the left child
    PostTraversal right;// The address of the right child
    PostTraversal(int data){
        this.data = data;
        this.left = this.right=null; //Initially Node has No children
    }
    public static void postOrder(PostTraversal root){ // LRD
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }

    }

    public static void main(String[] args) {
        //Construct the binary Tree
        // we must construct the tree from
        // top to bottom,left to right,level by level
        //Level 0
        PostTraversal root = new PostTraversal(1);

        //level 1

        root.left = new PostTraversal(2);
        root.right = new PostTraversal(3);
        //level 2
        root.left.left = new PostTraversal(4);
        root.left.right = new PostTraversal(5);
        root.right.left = new PostTraversal(6);
        root.right.right = new PostTraversal(7);
        //level 3
        root.left.right.left = new PostTraversal(9);
        root.right.right.left = new PostTraversal(15);
        System.out.println("PostOrder Traversal");
        postOrder(root);
    }

}
