package slidingwindow;

import java.util.*;

public class MaximumElement {

/* LT:239 Hard https://www.youtube.com/watch?v=DfljaUwZsOk
  Problem : Find the maximum from sliding window
  239. Sliding Window Maximum

 */

    // naive solution time complexity BigO(n*w) and space complexity O(1)

    public static List<Integer> findMaxSlidingWindow(List<Integer> nums, int windowSize) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i =0;i<nums.size()-windowSize+1;i++){
            int max = Integer.MIN_VALUE;
            for(int j =i;j<i+windowSize;j++)
                max = Math.max(max, nums.get(j));
            result.add(max);
        }
       return result;
    }

    public static List<Integer> findMaxSlidingWindow1(List<Integer> nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> window = new ArrayDeque<> ();
        // Return 0 if nums is empty
        if (nums.size() == 0)
            return result;
        // If window_size is greater than the array size,
        // set the window_size to the array size
        if (k > nums.size())
            k = nums.size();

        // Find out the maximum in the first window

        for(int i =0;i<k;i++){
            while (!window.isEmpty() && nums.get(i)>=nums.get(window.peekLast())){
                window.removeLast();
            }
            window.addLast(i);
        }
        // Appending the largest element in the window to the result
        result.add(nums.get(window.peek()));

        for(int i=k;i<nums.size();i++){

            // remove all numbers that are smaller than current number
            // from the tail of list
            while ((!window.isEmpty())&& nums.get(i) >= nums.get(window.peekLast())){
                window.removeLast();
            }
            if((!window.isEmpty()) && window.peek()<= (i-k))
                window.removeLast();

            window.addLast(i);
            result.add(nums.get(window.peek()));
        }



        return result;
    }




    public static void main(String args[]){
        List<Integer> targetList = Arrays.asList(18, 2, 1, 2, 4, 3, 2);

       List<Integer> result =   findMaxSlidingWindow1(targetList,4);
       for(Integer res : result){
           System.out.println(res);
       }
    }
}
