package dsa.hashmap;

import java.util.HashMap;

public class LongestSubarrayWithGivenSum {
   // Leetcode 560 :  Subarray Sum Equals K

    static int subArrayWithGivenSum(int nums[],int target){
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,1);

        int ans=0,sum=0;
        for(int i =0;i<nums.length;i++){
            sum+= nums[i];
            if(prefixSumMap.containsKey(sum-target)){
                ans+=prefixSumMap.get(sum-target);
            }
           prefixSumMap.put(sum,prefixSumMap.getOrDefault(sum,0)+1);
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {3,4,7,2,-3,1,4,2};
        int target = 7;

        System.out.println(subArrayWithGivenSum(arr,target));
    }
}
