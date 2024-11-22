package dsa.hashmap;

import java.util.HashMap;

public class SubArrayWithGivenSum {

    //leetcode 560
    static int subArrayWithGivenSum(int nums[],int target){
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,1);
        int count=0,sum=0;
        for(int i =0;i<nums.length;i++){
              sum += nums[i];
              if(prefixSumMap.containsKey(sum-target)){
                 count += prefixSumMap.get(sum-target);
              }
            prefixSumMap.put(sum,prefixSumMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String args[]){
       int arr[] = {4,1,6,2,1,1,1,9};
       int target = 5;
   //     int arr[]={3,4,3,-1,1};
    //    int target=0;
      System.out.println(subArrayWithGivenSum(arr,target));
    }
}
