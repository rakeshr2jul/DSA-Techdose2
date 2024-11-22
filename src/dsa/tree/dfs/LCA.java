package dsa.tree.dfs;

public class LCA {


    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null || root == p || root == q)
            return root ;

        TreeNode left = lca(root.left,p,q);
        TreeNode right = lca(root.right,p,q);

        if(left !=null && right !=null)
            return root;

        if(left !=null)
            return left;

        if(right !=null)
            return right;

        return null;

       // return left != null ? left : right;
    }

    public static void inOrder(TreeNode root){
      if(root !=null) {
          inOrder(root.left);
          System.out.print(root.val + " ");
          inOrder(root.right);
      }
    }

    public static void main(String  args[]){
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.left=new TreeNode(3);
       /* root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left= new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left= new TreeNode(0);
        root.right.right= new TreeNode(8);*/

        inOrder(root);
       TreeNode node = lca(root,root.left.left,root.left.right.right);

       System.out.println(node.val);
    }

}
