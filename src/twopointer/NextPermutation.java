package twopointer;

public class NextPermutation {
// LC31. Next Permutation
    public static void nextPermutation(int[] nums) {
        if(nums.length <= 1)
            return;
        int pivot = nums.length-2;

        while (pivot >=0 && nums[pivot]>= nums[pivot+1])
            pivot--;

        if(pivot >= 0){
            int j = nums.length-1;
             while (nums[pivot]>=nums[j])
                 j--;
             swap(nums,pivot,j);
        }
        reverse(nums,pivot+1);
        for(int n : nums)
            System.out.print(n+",");
    }

    public static void reverse(int nums[],int left){
        int right= nums.length-1;
        while (left < right){
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
    }
}
