package hashtable;

import java.util.HashMap;

public class  SubArrayWithGivenSum {

    //leetcode 560
    static int subArrayWithGivenSum(int nums[],int target){
       // int count =0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);

        int ans=0,sum=0;

        for(int i =0;i<nums.length;i++){
              sum+= nums[i];
              if(hashMap.containsKey(sum-target)){
                 ans += hashMap.get(sum-target);
              }
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
        }
        return ans;
    }


    public static void main(String args[]){
       int arr[] = {1,2,3};//{4,1,6,2,1,1,1,9};
       int target = 3;

      System.out.println(subArrayWithGivenSum(arr,target));

    }
}
