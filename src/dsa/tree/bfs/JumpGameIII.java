package dsa.tree.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII {
    //leetcode 1306 https://www.youtube.com/watch?v=7Cz91Uj0VCU
    static boolean canReach(int[] nums, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
       while (!q.isEmpty()){
            int point = q.poll();

            if(nums[point]==0)
                return true;
            int r = point+nums[point];
            int l = point-nums[point];
            nums[point] =-1;

            if(r< nums.length && nums[r] !=-1)
                q.add(r);
            if(l>=0 && nums[l]!=-1)
                q.add(l);
       }

        return false;

    }

    public static void main(String args[]){

        int nums [] ={4,2,3,0,3,1,2};

        System.out.println(canReach(nums,5));

    }
}
