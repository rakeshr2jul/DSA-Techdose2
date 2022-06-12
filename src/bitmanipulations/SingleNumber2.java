package bitmanipulations;

import java.util.Collections;
import java.util.HashMap;

public class SingleNumber2 {

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int singleNo =0;
        for(int n : nums){
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }
        System.out.println(hashMap.values());
        int minValue = Collections.min(hashMap.values());
        for(Integer key : hashMap.keySet()){
            int value = hashMap.get(key);
            if(value==minValue){
               singleNo=key;
            }
        }
        return singleNo;
    }

    public static int singleNumberUsingBit(int nums[]){
        int one =0;
        int two =0;
        for(int n : nums){
            one = (one ^ n) & ~two;
            two = (two ^ n) & ~one;
        }
        return one;
    }

    public static void main(String args[]){
        int a [] ={2,2,3,2};
        System.out.println(singleNumberUsingBit(a));
    }
}
