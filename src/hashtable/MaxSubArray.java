package hashtable;

import java.util.HashMap;

public class MaxSubArray {
// https://www.youtube.com/watch?v=XzwUBIkR9pA
    //LT 53 Medium  https://www.youtube.com/watch?v=HCL4_bOd3-4
    static int maxSubArray(int nums[]){

        int curSum=0;

       /* for(int i=0;i<nums.length;i++){
            curSum = curSum+nums[i];
            maxSum = Math.max(curSum,maxSum);
            if(curSum < 0)
                curSum=0;
        }*/

        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            curSum = Math.max(nums[i], curSum+nums[i]);
            maxSum = Math.max(curSum,maxSum);

        }

        return maxSum;

    }

    public static void main(String args[]){
        int arr[] = {2,-2,1,5};
        int target = 2;

        System.out.println(maxSubArray(arr));

    }
}
