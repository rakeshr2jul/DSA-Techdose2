package dsa.tree.dfs;

public class DiameterOfTree {

    //LT 543 -easy
    static int res =0;
    public static int diameterOfBinaryTree(TreeNode root) {
      // int dim =0;
       if(root ==null)
           return 0;
       height(root);
       return  res;
    }


    private static int height(TreeNode root){
        if(root==null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res,lh+rh);

        return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String args[]){
       TreeNode root =new TreeNode(1);
       root.left = new TreeNode(2);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       root.right = new TreeNode(3);

       System.out.println(diameterOfBinaryTree(root));
    }
}
