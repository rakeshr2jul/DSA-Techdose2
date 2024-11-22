package dsa.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {

    // leetcode 239 Hard https://www.youtube.com/watch?v=LiSdD3ljCIE
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length+1-k];
        int max =0;

        for(int i =0 ;i <= nums.length-k;i++){
            max = nums[i];
            for(int j =i ;j< i + k ;j++){
                 max = Math.max(max, nums[j]);
            }
            ans[i]=max;

        }
       return ans;
    }

    public static int [] maxSlidingWindow2(int nums[],int k){
        int n = nums.length;
        if(n ==0 || k ==0)
            return new int [0];
        int res [] = new int[n-k+1];
        Deque<Integer> window = new ArrayDeque<>();
        for(int i =0 ;i< n;i++){
            while (window.size() > 0 && window.peekFirst() <= i-k)
                window.pollFirst();
            while (window.size() > 0 && nums[window.peekLast()]< nums[i])
                window.pollLast();
            window.offerLast(i);

            if( i >= k-1 ){
                res[i-k+1] = nums[window.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String args[]){
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int window =3 ;
        for (int i : maxSlidingWindow(nums,window))
            System.out.print(i+",");
        System.out.println();
        for (int i : maxSlidingWindow2(nums,window))
            System.out.print(i+",");
    }
}
