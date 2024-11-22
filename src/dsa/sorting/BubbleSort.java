package dsa.sorting;

public class BubbleSort {

    public static void sort(int[] arr){

        if(arr.length==0)
            return;

        int temp =0;
        int n = arr.length;
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
               if(arr[i] > arr[j]) {
                  /* temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;*/
                   swap(arr,i,j);
               }
           }
       }


    }

    public static void swap(int arr[],int i ,int j){
        int temp =arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp;
   }




    public static void main (String args[]){
        int arr [] = {2,4,5,8,1,6,0};
        sort(arr);

        for(int a : arr){
            System.out.print(a+",");
        }
    }
}
