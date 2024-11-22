package dsa.dp;

public class JumpGame {

    //Leetcode 55 https://www.youtube.com/watch?v=muDPTDrpS28

    static boolean jump(int nums[]){
       int reachable =0;
       int n = nums.length;
       for(int i=0;i<n;i++){
           if(reachable < i ) {
               return false;
           }
           reachable = Math.max(reachable,i+nums[i]);
       }
       return true;
    }

    public static void main(String args[]){
        int nums[] ={3,2,1,0,4};
        //int nums[] ={1,1,2,5,2,1,0,0,1,3};
        System.out.println(jump(nums));
    }
}
