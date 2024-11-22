package dsa.arrays;

public class SortColor {
    // LT 75 : Medium
    // https://www.youtube.com/watch?v=4xbWSRZHqac
    public static void sortColors(int nums[]){
        int low =0;
        int high = nums.length-1;
        int mid =0; //{2,0,2,1,1,2,0,0}
        while (mid <= high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid]==1){
              mid++;
            }else {
                swap(nums,mid,high);
                high--;
               // mid--;
            }
        }
    }

    private static void swap(int arr[],int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
           int nums[] = {2,0,2,1,1,2,0,0};
           System.out.println("======"+nums.length);
           sortColors(nums);

        for(int n : nums){
            System.out.print(n+" ");
        }
    }
}
