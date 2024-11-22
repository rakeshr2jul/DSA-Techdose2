package dsa.tree.dfs;

import java.util.ArrayList;
import java.util.List;

public class TwoSumInputBST {
    // LT 653
    public static boolean findTarget(TreeNode root, int k) {

       if(root==null)
            return false;

       List<Integer> list = new ArrayList<>();
       inOrder(root,list);
       int st = 0;
       int end = list.size()-1;
       int sum =0;
       while(st < end){
            sum = list.get(st) + list.get(end);
            if(sum > k) {
                end--;
            }else if(sum < k){
                st ++;
            }else {
                return true;
            }
       }
       return false;
    }

    private static void inOrder(TreeNode root,List<Integer> list){
        if(root == null)
            return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
   }

    public static void main(String args[]){

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(findTarget(root,9));

    }
}
