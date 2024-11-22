package dsa.hashmap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElement {

    // 347. Top K Frequent Elements
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for(int n:nums){
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int n : freqMap.keySet()){
            queue.offer(n);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int res[] = new int[k];
        int index=0;
        while (!queue.isEmpty()){
            res[index++] = queue.poll();
        }

       return  res;
    }

    public static int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Long> hashMap = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        PriorityQueue<Map.Entry<Integer, Long>> queue = new PriorityQueue<>((e1, e2) -> (int) (e2.getValue() - e1.getValue()));
        queue.addAll(hashMap.entrySet());
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll().getKey();
        }
        return ans;
    }


    public static int [] topKFrequentWithBucketSort(int[] nums, int k){
        Map<Integer,Integer> frquencyMap = new HashMap<>();
        List<Integer> bucket[] = new List[nums.length+1];

        for(int n : nums) {
            frquencyMap.put(n, frquencyMap.getOrDefault(n, 0) + 1);
        }
          //0,1,1,3,3,2,2,3
        /*    0 -> 1
              1 -> 2
              3- > 3
              2 -> 2
         */
        for(int key : frquencyMap.keySet()){
           int frequency= frquencyMap.get(key);
           if(bucket[frequency]==null){
               bucket[frequency]=new ArrayList<>();
           }
           bucket[frequency].add(key);
       }
        /* bucket[1] =0
           bucket[2] = 1, 1,
           bucket[3] = 3,3,3
           bucket[2] = 2,2
         */

        List<Integer> topK = new ArrayList<>();

         for(int pos = bucket.length-1;pos >=0 && topK.size()<k;pos-- ){
             if(bucket[pos] !=null){
                 topK.addAll(bucket[pos]);
             }

         }
        return topK.stream().mapToInt(i->i).toArray();
    }
    public static void main(String args[]){
       int nums[] ={0,1,1,3,3,2,2,3};

       int res[] = topKFrequentWithBucketSort(nums,2);

       System.out.println(Arrays.toString(res));
    }
}
