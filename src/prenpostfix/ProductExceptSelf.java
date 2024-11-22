package prenpostfix;

public class ProductExceptSelf {

    public static  int[] productExceptSelf(int nums[]){
        int n = nums.length;
        int res [] = new int[n];
        int prefix = 1;

        for(int i=0;i<n;i++){
            res[i] = prefix;
           // {1,2,3,4}
            prefix = prefix * nums[i];
            System.out.print(res[i]+" ");
        }
        System.out.println();
        int postfix = 1;
        for(int i= n-1;i>=0;i--){
          res[i] =res[i] * postfix;
          postfix = postfix * nums[i];
           System.out.print(postfix+" ");
        }
      return res;

    }

    public static void main(String args[]){
       int nums [] ={1,2,3,4};

       int op [] = productExceptSelf(nums);
       System.out.println();
       for(int n : op){
           System.out.print(n+" ");
       }

    }
}
