package dsa.arrays;

import java.util.HashMap;

public class TwoSum {

    // leet code 1. Two Sum
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int complement = target - nums[i];
             if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement),i};
             }
             hashMap.put(nums[i], i);
        }
       return null;
    }



    public static void main(String args[]){
       int ar [] ={2,7,11,15};
       int target = 9;

       int ans [] = twoSum(ar,target);
        for( int a : ans)
           System.out.println(a +" ");
    }
}
