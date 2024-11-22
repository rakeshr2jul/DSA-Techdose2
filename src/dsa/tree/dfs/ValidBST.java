package dsa.tree.dfs;

public class ValidBST {

    // LT 98
    public static boolean isValidBST(TreeNode root) {
        if(root ==null)
            return true;
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean helper(TreeNode root,int min,int max){
        if(root==null)
            return true;
        if(root.val < min || root.val > max)
            return false;

        return helper (root.left,min,root.val) && helper(root.right,root.val,max);
    }
    public static void main (String args[]){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
     //   root.right.left = new TreeNode(3);
     //   root.right.right = new TreeNode(6);
       System.out.println( isValidBST(root));

    }
}
