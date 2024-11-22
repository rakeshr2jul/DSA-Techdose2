package dsa.tree.dfs;

public class ConvertSortedArrayIntoBST {

    // LT 108
    public static TreeNode sortedArrayToBST(int[] nums) {
       if(nums.length == 0)
           return null;
       if(nums.length == 1)
           new TreeNode(nums[0]);

     return createBST(nums,0,nums.length-1);
    }

    private static TreeNode createBST(int arr[],int l,int r){
        if(l > r)
            return null;
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(arr[mid]);
           root.left =     createBST(arr,l,mid-1);
           root.right = createBST(arr,mid+1,r);
       return root;
    }

    public static void main(String args[]){
        int nums[] ={-10,-3,0,5,9};
        TreeNode node = sortedArrayToBST(nums);
        inOrder(node);
    }

    public static void inOrder(TreeNode root){
        if(root !=null) {
            System.out.print(root.val + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }
}
