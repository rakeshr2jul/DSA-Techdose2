package dsa.arrays;

public class NextPermutation {
   // LT 31 : Medium https://www.youtube.com/watch?v=6qXO72FkqwM
    public static void nextPermutation(int[] nums) {
        if(nums.length <= 1)
            return;
        int i = nums.length-2;
        while (i >=0 && nums[i]>= nums[i+1])
            i--;

        if(i >= 0){
            int j = nums.length-1;
             while (j >= 0 && nums[i]>=nums[j])
                 j--;
             swap(nums,i,j);
        }
        reverse(nums,i+1);

    }

    public static void reverse(int nums[],int left ){
        int right = nums.length-1;
        while (left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    public static void swap(int nums[],int left,int right){
        int temp = nums[left];
            nums[left] = nums[right];
            nums[right]= temp;
    }

    public static void main(String args[]){
            int nums[] = {1,2,3};
            nextPermutation(nums);
            for(int n : nums){
                System.out.print(" "+n);
            }
    }
}
