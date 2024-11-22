package dsa.tree.dfs;

public class RangeSumBst {
//LT :938 -easy
    public static int rangeSumBST(TreeNode root, int low, int high) {
       int res =0;
       if(root==null || low<=0 || high <= 0)
           return res;

       if(root.val >= low && root.val<= high)
           res +=root.val;
       int resLeft = rangeSumBST(root.left,low,high);
       int resRight = rangeSumBST(root.right,low,high);

       return res+resLeft+resRight;
    }

    public static void main(String args[]){

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(18);

        System.out.println("===="+  rangeSumBST(root,7,15));

    }
}
