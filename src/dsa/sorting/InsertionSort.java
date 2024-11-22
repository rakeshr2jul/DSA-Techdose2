package dsa.sorting;

public class InsertionSort {

    public static void insertionSort(int arr[]){

        if(arr.length==0)
            return;

        for(int i =1 ;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
           // for(int j =1 ; j<;j++)
            while (j>=0 && arr[j]> key){
                arr[j+1]= arr[j];
                j--;
            }
             arr[j+1]=key;
        }

    }

    public static void main (String args[]){
        int arr [] = {4,2,5,8,1,6,0};
        insertionSort(arr);

        for(int a : arr){
            System.out.print(a+",");
        }
    }
}
