package dsa.searching;

public class FindPeekElement {

    // LT 162 easy
    static int findPeek(int arr[]){
        int low =0;
        int high = arr.length-1;

        while (low< high){
            int mid = (low+high)/2;
            if(arr[mid] > arr[mid+1])
                high = mid;
            else
                low = mid+1;

           /* if(((mid == 0 || arr[mid-1] <= arr[mid])) && (mid == n-1 || arr[mid+1] <=arr[mid])){
                return mid;
            }
            if(mid >0 && arr[mid-1]>= arr[mid])
                high = mid-1;
            else
                low = mid + 1;
           */
        }
        return low;
   }

    public static void main(String args[]){

        int arr [] = {5,10,20,40,60,80,70};

        System.out.println(findPeek(arr));
    }
}
