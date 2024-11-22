package dsa.searching;

public class CountOccuranceOfElementFromArray {

    static int binarySearch(int arr[],int target,boolean searchFirst){

        int left =0;
        int right = arr.length-1;
        int result=-1;

        while (left<=right){
            int mid = (left+right)/2;

            if(target==arr[mid]){
                result =mid;
               if(searchFirst){
                  right = mid-1;
               }else {
                   left = mid+1;
               }
            }else if(target < arr[mid]){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return result;

    }

    public static void main(String args[]){

        int[] nums = {2, 5, 5, 5, 5, 8, 9, 9, 9};
        int target = 5;

        // pass true for the first occurrence
        int first = binarySearch(nums, target, true);

        int last = binarySearch(nums,target,false);

        System.out.println("Num of occ :"+(last-first+1));

    }
}
