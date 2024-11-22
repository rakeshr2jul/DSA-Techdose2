package dsa.tree.dfs;

public class PathSum {

    //LT :112
    public static boolean hasPathSum(TreeNode root, int targetSum) {
      //  System.out.println(targetSum-root.val);
        if(root==null)
            return false;
        if(root.left ==null || root.right==null && root.val == targetSum)
            return true;

        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);

    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        System.out.println(hasPathSum(root,22));
    }
}
