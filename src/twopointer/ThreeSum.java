package twopointer;

import java.util.*;

public class ThreeSum {
  // Leetcode 15
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        for(int i =0;i<nums.length;i++){
            int a = nums[i];
            if (i > 0 && a==nums[i-1])
                continue;
            int l = i+1 ;
            int r = nums.length-1;
            while(l < r){
                int sum = a + nums[l]+nums[r];
                if(sum > 0)
                    r--;
                else if(sum < 0)
                    l++;
                else {
                    ans.add(Arrays.asList(a,nums[l],nums[r]));
                    l++;
                    r--;
               }
            }
       }
      return new ArrayList<>(ans);
    }

    public static void main(String args[]){
       int a[]={-1,0,1,2,-1,-4};
       System.out.println(threeSum(a));
    }
}
