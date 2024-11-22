package twopointer;

import java.util.Arrays;

public class TwoSumII {
// LC167
    public static int [] twoSum(int nums[],int target){
        int st = 0;
        int end = nums.length-1;
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
       // int nums [] = {3,2,4};
        //int target = 6;
        Arrays.stream(twoSum(nums, target)).forEach(i-> System.out.print(i+" "));

    }
}
