package dsa.tree.dfs;

import dsa.arrays.TrappingRainWater;

public class SymmetricTree {

    //101
    public static boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
      return helper(root.left,root.right);
    }

    private static boolean helper(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null)
            return true;
        if(root1==null && root2!=null)
            return false;
        if(root1!=null && root2==null)
            return false;
        if(root1.val != root2.val)
            return false;
        if(helper(root1.left,root2.right) && helper(root1.right,root2.left))
            return true;

        return false;
    }
    public static void main(String args[]){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));

    }
}
