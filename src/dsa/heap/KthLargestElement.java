 package dsa.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
//LC 215 - Medium. Kth Largest Element in an Array
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static  int findKthLargest1(int[] nums, int k){
       //  below is maxHeap
      // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
      /*  int res [] = new int[k];
       while (! minHeap.isEmpty()){
           for (int i = 0;i<res.length;i++){
               res[i]= minHeap.poll();
           }
        }*/
       return minHeap.poll();
      //  return res;
    }
    public static void main(String args[]){
        int nums[] = {3,0,1,5,6,4};
        int k = 3;
       /* int res[] = findKthLargest1(nums,k);
        for(int n : res){
            System.out.println(n);
        }*/

        System.out.println(findKthLargest1(nums,k));

    }
}
