package dsa.tree.dfs;

public class SameTree {
   //100 easy
    public static boolean isSameTree(TreeNode p, TreeNode q) {
       if(p == null &&  q==null)
           return true;
       if(p ==null && q != null || p!=null && q ==null)
           return false;
       if(p.val != q.val)
           return false;
      return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    private  static  boolean helper(TreeNode p, TreeNode q){

        if(p.left!=null && q.right ==null)
            return false;
        if(p.right !=null && q.left ==null)
            return false;
        if(p.val == q.val)
            return true;

        return false;

    }
    public static void main(String args[]){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
      //  p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);
      //  q.right = new TreeNode(2);

        System.out.println(isSameTree(p,q));
    }
}
