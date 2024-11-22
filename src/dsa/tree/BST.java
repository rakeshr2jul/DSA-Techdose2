package dsa.tree;

public class BST {

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int k){
            key = k;
            left = right= null;
        }

    }

    static boolean search(Node root,int key){

        while(root !=null){
            if(root.key==key)
                return true;
            else if(root.key < key)
                root = root.right;
            else
                root = root.left;
        }
         return false;

    }

    static Node insertRec(Node root,int key){
        if(root==null) {
            return new Node(key);
        }
        if(root.key > key)
            root.left = insertRec(root.left,key);
        else
            root.right = insertRec(root.right,key);

        return root;
    }

    static Node insert(Node root,int key){

        Node temp = new Node(key);

        Node parent = null;
        Node curr = root;

        while (curr !=null){
              parent = curr;

              if(curr.key < key)
                  curr = curr.right;
              else if(curr.key > key)
                  curr = curr.left;
              else
                  return root;
        }

        if(parent ==null)
            return temp;
        if(parent.key < key)
            parent.right=temp;
        else
            parent.left = temp;

        return root;

    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }

    public static Node delNode(Node root, int key){

        if(root ==null)
            return root;

        if(root.key > key)
            root.left = delNode(root.left,key);
        else if(root.key < key)
            root.right = delNode(root.right,key);
        else {

            if(root.left ==null) {
                return root.right;
            }else if(root.right ==null){
                return root.left;
            }else {
                Node succ = getSuccessor(root);
                root.key = succ.key;
                root.right=delNode(root.right,succ.key);
            }
        }
        return root;
   }

   public static Node getSuccessor(Node curr){
      curr = curr.right;

      while (curr!=null && curr.left !=null){
          curr = curr.left;
      }
      return curr;
   }

   static Node floor(Node root,int x){

        Node res = null;
        while(root!=null){
            if(root.key == x)
                return root;
            else if(root.key > x)
                root = root.left;
            else {
                res = root;
                root = root.right;
            }
        }
        return res;
   }

   static  Node ceil(Node root, int x){

        Node res = null;
        while (root != null){
            if(root.key==x)
                return root;
            else if(root.key < x)
                root = root.right;
            else {
                res = root;
                root = root.left;
            }
        }
        return res;
   }
    public static void main(String args[]){

        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);

        int x=16;

        System.out.println(search(root,6));

      //  Node root1 =insertRec(root,8);
     //    root = insert(root,25);
      //  inorder(root);

        //root = floor(root,81);
        //root = delNode(root,18);
        //inorder(root);
        System.out.print("Ceil: "+(ceil(root,17).key));
     //   root = ceil(root,17).key;
      //  inorder(root);

    }
}
