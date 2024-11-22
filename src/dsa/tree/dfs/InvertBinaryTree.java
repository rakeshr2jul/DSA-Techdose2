package dsa.tree.dfs;

public class InvertBinaryTree {

    //LT 226
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }


    public static void preOrder(TreeNode root){

        if(root!=null){
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);

        }

    }
    public static void main(String args[]){

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        preOrder(root);
        System.out.println("");
        TreeNode invert=  invertTree(root);
        preOrder(invert);
    }


}
