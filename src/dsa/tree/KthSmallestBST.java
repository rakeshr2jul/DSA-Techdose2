package dsa.tree;

import java.util.Stack;

public class KthSmallestBST {

    // LT : 230 Kth Smallest Element in a BST

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }

    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count =0;

        while (curr !=null || !stack.isEmpty()){
            if(curr !=null){
                stack.push(curr);
                curr = curr.left;
            }else {
                TreeNode node = stack.pop();
                if(++count==k)
                    return node.val;
                curr = node.right;
            }
        }
         return Integer.MIN_VALUE;
    }

    public static void main(String args[]){
      TreeNode root = new TreeNode(30);
      root.left = new TreeNode(10);
      root.right = new TreeNode(40);
      root.left.right = new TreeNode(20);

      System.out.println(""+kthSmallest(root,1));
    }
}
