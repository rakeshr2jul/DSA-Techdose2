package dsa.hashmap;

import java.util.HashSet;

public class SubArrayWithZeroSum {

   static boolean isZeroSum(int arr[]){
        int prefix_sum =0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            prefix_sum += arr[i];
            if(hs.contains(prefix_sum)) return true;
            if(prefix_sum==0) return true;
            hs.add(prefix_sum);
        }
        return false;
    }
    public static void main(String args[]){
             int arr[] = {3,4,3,-1,1};

             System.out.println(isZeroSum(arr));
     }
}
