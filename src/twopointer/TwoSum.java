package twopointer;

import java.util.HashMap;

public class TwoSum {

    //1. Two Sum
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

    public int[] twoSum1(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i],i);

        for(int i=0;i<nums.length;i++) {
            int num = nums[i];
            int rem = target- num;
            if (hm.containsKey(rem)) {
                int index = hm.get(rem);
                if (index == i)
                    continue;
                return new int[]{i, hm.get(rem)};
            }
        }
        return null;

    }

    public static void main(String args[]){
       int ar [] ={2,7,11,15};
       int target = 9;

       int ans [] = twoSum(ar,target);

       System.out.println(ans);
    }
}
