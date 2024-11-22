package dsa.tree.bfs;

import dsa.tree.dfs.TreeNode;

import java.util.*;

public class LevelOrderTraversing {

    public static List<List<Integer>> levelOrder(TreeNode root){

        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>() ;

        if(root==null)
            return list;

        queue.offer(root);

        while (!queue.isEmpty()){
            int size =queue.size();
            List<Integer> temp = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.peek();
                if(curr.left !=null) queue.offer(curr.left);
                if (curr.right !=null) queue.offer(curr.right);
                temp.add(queue.poll().val);
            }
            list.add(temp);
        }
      return list;

    }

    public static void main(String args[]){

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> res = levelOrder(root);

        System.out.println(res);

    }
}
