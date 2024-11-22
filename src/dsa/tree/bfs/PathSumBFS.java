package dsa.tree.bfs;

import dsa.tree.dfs.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PathSumBFS {

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if(root==null)
            return false;

        Queue<TreeNode> queue = new LinkedList<>() ;
        Queue<Integer> sum = new LinkedList<>();
        queue.add(root);
        sum.add(root.val);

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i =0;i<size;i++){
                  TreeNode curr = queue.remove();
                  int currSum = sum.remove();

                  if(targetSum==currSum && curr.left==null && curr.right==null)
                      return true;
                  if(curr.left!=null){
                      queue.add(curr.left);
                      sum.add(curr.left.val+currSum);
                  }
                  if(curr.right!=null){
                      queue.add(curr.right);
                      sum.add(curr.right.val+currSum);
                  }
           }



        }
        return false;
    }

    public static void main(String args[]){

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left= new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);

       System.out.println(hasPathSum(root,22));
    }
}
