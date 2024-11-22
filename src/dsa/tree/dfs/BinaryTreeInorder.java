package dsa.tree.dfs;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorder {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root ==null)
            return list;

        if(root.left !=null){

            List<Integer> leftRes=   inorderTraversal(root.left);
            for(Integer i :leftRes){
                list.add(i);
            }

        }

        list.add(root.val);

        if(root.right !=null){

            List<Integer> rightRes= inorderTraversal(root.right);
            for(Integer i :rightRes){
                list.add(i);
            }

        }

        return list;
    }
}
