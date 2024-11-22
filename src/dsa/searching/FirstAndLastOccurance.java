package dsa.searching;

public class FirstAndLastOccurance {

    static int lastOcc(int arr[],int n, int x){
        int low =0;
        int high =n-1;
        int result = -1;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            if(arr[mid]==x)
               result =mid;
        }
        return result;
    }

    static  int  firstOcc(int arr[],int n , int x){
        int low =0;
        int high = n;
        int result=-1;

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                // result = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
            if(arr[mid]== x)
                result=mid;
        }
        return result;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstOcc(nums,nums.length, target);
        result[1] = lastOcc(nums,nums.length, target);
        return result;
    }

    public static void main(String args[]){
        int arr [] ={5,10,10,10,10,20};

       int res[]= searchRange(arr , 10);
       for (int r : res)
         System.out.println(r);
    }
}
