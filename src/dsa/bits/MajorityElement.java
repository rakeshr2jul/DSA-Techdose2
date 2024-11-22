package dsa.bits;

import java.util.Collections;
import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int majority=0;
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i]))
             hashMap.put(nums[i],hashMap.get(nums[i])+1);
            else
             hashMap.put(nums[i],1);
        }
        int maxValueInMap = (Collections.max(hashMap.values()));
        for (Integer key : hashMap.keySet()){
            // search  for value
            Integer value = hashMap.get(key);
            if(value==maxValueInMap)
                majority= key ;
        }
         return majority;
    }

    public static int majorityElementWithBit(int nums[]){
      int me = nums[0];
      int count = 1;
      int n = nums.length;
      for(int i =1;i<n;i++){
          if(count==0){
              me = nums[i];
              count=1;
          }else {
              if (nums[i]==me)
                  count++;
              else
                  count--;
          }
      }
     return me;
    }

    public static void main(String args[]){
        int a [] ={3,2,3};
        System.out.println(majorityElementWithBit(a));
    }
}
