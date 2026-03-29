package Assignment5.Module13;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class BSTInsert {
    public static void inOrder(TreeNode root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static TreeNode insert(TreeNode root,int key){
        if (root == null){
            //The new node will become the root node
            return new TreeNode(key);
        }
        if(key< root.data){
            root.left = insert(root.left,key);
        } else if (key > root.data) {
            root.right = insert(root.right,key);//this is the only access the tree
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root,50);
        inOrder(root);
        System.out.println();
        int[] arr = {60,20,30,10,58,100};
        for (int i =0; i<arr.length; i++){
            root = insert(root,arr[i]);
        }
        inOrder(root);
        System.out.println();
    }

}
