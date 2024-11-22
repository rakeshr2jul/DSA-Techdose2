package dsa.arrays;

// LT 209 - medium https://www.youtube.com/watch?v=aYqYMIqZx5s
public class MinimumSubArray {
   //  nums [] ={2,3,1,2,4,3};
   //  target =7;


    public static int minSubArrayLen(int target, int[] nums) {
        int l =0,r =0,sum=0;
        int n = nums.length;
        int shortest = Integer.MAX_VALUE;
         while(r < n){
             sum = sum + nums[r];
             if(sum >= target){
                 while (sum >=target){
                    sum = sum - nums[l];
                    l++;
                  }
                 shortest=Math.min(shortest,r-l+2);
             }
             r++;
         }
         return shortest==Integer.MAX_VALUE ?0:shortest;
    }

    public static void main(String args[]){

        int nums [] ={2,3,1,2,4,3};
        int target =7;

        System.out.println(minSubArrayLen(target,nums));

    }
}
