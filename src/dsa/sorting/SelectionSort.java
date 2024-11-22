package dsa.sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]){
         if(arr.length ==0)
             return;

         for(int i =0;i<arr.length-1;i++){
             int min_id=i;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j] < arr[min_id])
                     min_id=j;
             }
           /* int temp = arr[min_id];
             arr[min_id]=arr[i];
             arr[i] = temp;*/
             swap(arr,min_id,i);
         }

    }

    public static void swap(int arr[],int i ,int j){
        int temp =arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main (String args[]){
        int arr [] = {2,4,5,8,1,6,0};
        selectionSort(arr);

        for(int a : arr){
            System.out.print(a+",");
        }
    }
}
