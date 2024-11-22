package dsa.arrays;

public class MaxSubArray {
    //LC53 -- medium https://www.youtube.com/watch?v=5WZl3MMT0Eg
    public static int maxSubArray(int[] nums){

        if(nums.length ==0)
            return 0 ;

        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        for(int i=0;i<nums.length ;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }


    public static void main(String args[]){
       int nums[] ={-2,1,-3,4,-1,2,1,-5,4};

       System.out.println(maxSubArray(nums));
    }
}
