package dsa.tree.bfs;

import dsa.tree.dfs.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SumOfLeftLeaves {
// LT 404
    public static int sumOfLeftLeaves(TreeNode root) {
        int res =0;
        if(root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
                TreeNode curr = queue.poll();
                if(curr.left!=null){
                    if(curr.left.left==null && curr.left.right==null)
                        res =res+curr.left.val;
                    else
                        queue.add(curr.left);
                }
                if(curr.right!=null){
                   /* if(curr.right.right==null && curr.right.left==null)
                        res = res+curr.right.val;
                    else*/
                      queue.add(curr.right);
                }
            //}
        }
        return res;
    }

    public static void main(String args[]){
      TreeNode root = new TreeNode(3);

      root.left = new TreeNode(9);
      root.right = new TreeNode(20);
      root.right.left = new TreeNode(15);
      root.right.right = new TreeNode(7);


      System.out.println(sumOfLeftLeaves(root));

    }
}
