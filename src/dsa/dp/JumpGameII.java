package dsa.dp;

public class JumpGameII {

     // Leetcode 45 : https://www.youtube.com/watch?v=BRnRPLNGWIo

    static int jump(int nums[]){
        int begin=0;
        int farthest=0;
        int jump=0;
        // {2,3,1,1,4}
        for(int i=0;i<nums.length-1;i++){
             farthest = Math.max(farthest,i+nums[i]);
                if(i == begin){
                    jump++;
                    begin =farthest;
                }
        }
        return jump;
    }

    public static void main(String args[]){
        //int nums[] ={2,3,0,1,4};
        int nums[] = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
