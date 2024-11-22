package dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ChildernSumOfTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = right=null;
        }
    }

    public static void main(String args[]){

        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(3);
        root.left.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right = new Node(12);
        root.right.right = new Node(50);

        System.out.println("calling isSum "+isSum(root));

        System.out.println("calling isBalance "+isBalance(root));
        System.out.println(isBalanced(root));

        System.out.println("Max Width ::"+maxWidth(root));

        System.out.println("diameter ::"+diameter(root));
    }

    static boolean isSum(Node root){
        if(root == null)
            return true;
        if(root.left == null && root.right==null)
            return true;
        int sum =0;

        if(root.left != null)
            sum += root.left.data;

        if(root.right != null)
            sum += root.right.data;
        return (root.data == sum && isSum(root.left) && isSum(root.right));
    }

    static boolean isBalance(Node root){
        if(root==null)
            return true;

        int lh = height(root.left);
        int rh = height(root.right);

        return (Math.abs(lh-rh)<=1 && isBalance(root.left) && isBalance(root.right));

    }
    static int height(Node root){
        if(root ==null)
            return 0;
        else
        return Math.max(height(root.left),height(root.right))+1;
    }

    static int isBalanced(Node root){
        if(root == null)
            return 0;
        int lh = isBalanced(root.left);
        if (lh == -1)
            return -1;
        int rh = isBalanced(root.right);
        if(rh == -1)
            return -1;
        if(Math.abs(lh-rh)>1 )
            return -1;
        else
            return Math.max(lh,rh)+1;
    }

    static int maxWidth(Node root){
        if(root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int res =0;
        while (q.isEmpty()==false){
            int count = q.size();
            res = Math.max(res,count);
           for (int i =0;i<count;i++) {
               Node curr = q.poll();
               if (curr.left !=null)
                   q.add(curr.left);
               if(curr.right !=null)
                   q.add(curr.right);

           }
        }
     return res;

    }

    static int diameter(Node root){

        if(root ==null)
            return 0;

        int d1 = height(root.left)+height(root.right)+1;
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1,Math.max(d2,d3));
    }
}
