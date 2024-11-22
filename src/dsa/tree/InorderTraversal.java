package dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InorderTraversal {
    static int maxLevel =0;

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = right= null;
        }

    }

    public static  void main(String args[]){

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        inOrder(root);
        System.out.println("");
        preOrder(root);
        System.out.println("");
        postOrder(root);
        System.out.println("");
        System.out.println("height of dsa.tree is "+height(root));
     //   for (int i =0 ;i < height(root);i++) {
            printKDistance(root, 2);
       // }
        System.out.println("level order");
        printLevelOrder(root);
        printLevelOrderLine(root);
        System.out.println("size of dsa.tree is " + size(root));
        System.out.println("max element in dsa.tree "+max(root));
        printLeftView(root);
        printLeft1(root);
        System.out.println("==========>>"+isBalanced(root));
    }

    public static void inOrder(Node root){
       if(root != null){
           inOrder(root.left);
           System.out.print(root.data+" ");
           inOrder(root.right);
       }
    }

    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static  int height(Node root){
       if(root == null)
           return 0;
       else
        return Math.max(height(root.left),height(root.right))+1;
    }

    public static boolean isBalanced(Node root){

        if(root ==null)
            return true;

        int lh = height(root.left);
        int rh = height(root.right);

        return (Math.abs(lh -rh)<=1 && isBalanced(root.left) && isBalanced(root.right));

    }
    public static void printKDistance(Node root,int k){
       if(root== null)
           return;
       if(k==0) {
           System.out.print(root.data + " ");
       }
       else{
           printKDistance(root.left,k-1);
           printKDistance(root.right,k-1);
         }

    }
    public static void printLevelOrder(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }

    public static void printLevelOrderLine(Node root){

       if(root == null)
           return;
       Queue<Node> q = new LinkedList<>();
       q.add(root);

       while (q.isEmpty() == false){

           int count = q.size();
           for(int i =0;i<count;i++){
               Node curr = q.poll();
               System.out.print(curr.data+" ");
               if(curr.left !=null)
                   q.add(curr.left);
               if(curr.right !=null)
                   q.add(curr.right);
           }
        System.out.println("==================");

       }
   }

   static int size(Node root){
       if(root==null){
           return 0 ;
       }else {
           return 1 + size(root.left)+ size(root.right);
       }
   }

   static int max(Node root){
       if(root ==null)
           return Integer.MIN_VALUE;
       else
           return Math.max(root.data, Math.max(max(root.left),max(root.right)));
   }

   static private void printleft(Node root,int level){
     if(root==null)
         return;
     if(maxLevel < level){
         System.out.print(root.data+" ");
         maxLevel = level;
     }
     printleft(root.left,level+1);
     printleft(root.right,level+1);
   }
   static void printLeftView(Node root){
       printleft(root,1);
   }

   static void printLeft1(Node root){
         System.out.println("print left");
        if(root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.isEmpty()==false){
            int count = q.size();
            for(int i =0;i<count;i++){
                Node curr = q.poll();
                if(i==0){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right !=null)
                    q.add(curr.right);
           }
        }
   }
}
