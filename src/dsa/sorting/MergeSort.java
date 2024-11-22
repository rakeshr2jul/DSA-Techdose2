package dsa.sorting;

public class MergeSort {

    public static void mergeSort(int arr[],int low,int high){

       if(low==high)
            return;
       if(low<high) {
           int mid = low + (high - low) / 2;
           mergeSort(arr, low, mid);
           mergeSort(arr, mid + 1, high);
           merge(arr, low, mid, high);
       }

    }

    public static void merge(int arr[],int low,int mid,int high){
        int left[] = new int[mid-low+1];
        int right[] = new int[high-mid];

        for(int i =0;i<left.length;i++)
            left[i] = arr[low+i];

        for(int j=0;j <right.length;j++)
            right[j] = arr[mid+1+j];

        int i=0 , j=0;
        int k =low;

         while(i<left.length && j<right.length){
             if(left[i] <= right[j]){
                 arr[k++] = left[i++];
             }else {
                 arr[k++] =right[j++];
             }
         }
         while (i<left.length)
             arr[k++]=left[i++];
         while (j < right.length)
          arr[k++] =right[j++];
    }

   static void mergeSort(int nums[],int low,int mid,int high){
        //setting up auxiliary dsa.arrays
       int left[] = new int[mid-low+1];
       int right[] = new int[high-mid];

       for(int i=0;i<left.length;i++){
           left[i]= nums[low+i];
       }
       for (int j =0;j<right.length;j++){
           right[j] = nums[mid+j+1];
       }
      int i =0,j=0,k=0;

       while (i<left.length && j<right.length){

           if(left[i] <=right[j]){
               nums[k++] = left[i++];
           }else {
               nums[k++] = right[j++];
           }
       }

       while (i < left.length) {
        nums[k++] = left[i++];
       }
      while(j < right.length){
          nums[k++] = right[j++];
      }
      for(int n : nums){
          System.out.print(n+",");
      }
   }

    public static void main(String args[]){

        int arr [] = {4,2,5,8,1,6,0};
        mergeSort(arr,0,arr.length-1);

        for(int a : arr){
            System.out.print(a+",");
        }

        int nums[] = {10,20,40,20,30};
        mergeSort(nums,0,2,nums.length-1);

    }
}
