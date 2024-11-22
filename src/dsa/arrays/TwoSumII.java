package dsa.arrays;

import java.util.Arrays;

public class TwoSumII {

    // leetcode 167 medium https://www.youtube.com/watch?v=cQ1Oz4ckceM
    public static int [] twoSum(int nums[],int target){
        int st = 0;
        int end = nums.length-1;
       // Arrays.sort(nums);
         while(st < end){
             int sum = nums[st]+nums[end];
             if(sum > target){
                 end --;
             }else if(sum < target){
                 st++;
             }else{
              return   new int[] {st+1,end+1};
             }
         }
            return null;
    }

    public static void main(String args []){

        int nums [] ={2,7,9,11};
        int target = 9;
       // int nums [] = {2,3,4};
       // int target = 6;
        Arrays.stream(twoSum(nums, target)).forEach(i-> System.out.println(i));

    }
}
