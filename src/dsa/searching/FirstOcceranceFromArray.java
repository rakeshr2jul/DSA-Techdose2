package dsa.searching;

public class FirstOcceranceFromArray {

     static int firstOccUsingRec(int arr[],int low, int high, int x){

         if(low > high)
             return -1;

         int mid = (low+high)/2;

         if(x > arr[mid]){
             return firstOccUsingRec(arr,mid+1,high,x);
         }else if(x < arr[mid]){
             return firstOccUsingRec(arr,low,mid-1,x);
         }else {
             if(mid==0 || arr[mid-1] !=arr[mid])
                 return mid;
             else
                 return firstOccUsingRec(arr,low,mid-1,x);
         }
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

    public static void main(String args[]){

        int arr [] ={5,8,10,10,15,20};

        System.out.println(firstOccUsingRec(arr,0 , arr.length, 10));
        System.out.println(firstOcc(arr , arr.length, 10));
        
        
    }
}
