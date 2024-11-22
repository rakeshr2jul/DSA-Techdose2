package hashtable;

import java.util.*;

public class TopKFrequentElement {

    // LT 347 Medium
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int n:nums){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }
        List<Integer> list = new ArrayList<>(freqMap.keySet());
        Collections.sort(list,(a,b)-> freqMap.get(b)-freqMap.get(a));

        int res[] = new int[k];

        for(int i=0;i<k;i++){
           res[i]= list.get(i);
        }
       return  res;
    }

    public static void main(String args[]){
       int nums[] ={1,1,1,2,2,3};

       int res[] = topKFrequent(nums,2);

       System.out.println(Arrays.toString(res));
    }
}
