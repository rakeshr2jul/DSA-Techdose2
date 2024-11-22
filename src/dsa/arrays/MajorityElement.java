package dsa.arrays;

public class MajorityElement {

    // Leetcode 169 moore's voting algo - easy https://www.youtube.com/watch?v=7pnhv842keE
    public static int majorityElement(int[] nums) {
        int me = nums[0];
        int count = 1;
        for(int i =1;i<nums.length;i++){
            if(count==0){
                me = nums[i];
                count=1;
            }else {
                if (nums[i]==me)
                    count++;
                else count--;
            }
        }
        return me;
    }

    public static void main(String args[]){

        int arr[] ={8,8,6,4,6,6,6,7,2};

        System.out.println(majorityElement(arr));


    }
}
