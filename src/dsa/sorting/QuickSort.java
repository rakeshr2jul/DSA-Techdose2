package dsa.sorting;

public class QuickSort {

    public static void quickSort(int arr[],int low,int high){

      /*  if(low<high){
            int p = lPartition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }*/

       if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p);
            quickSort(arr,p+1,high);
        }
    }
   // hoare partition
    private static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low-1;
        int j = high+1;

        while(true){
            do{
                i++;
            }while (arr[i] < pivot);
            do{
                j--;
            }while (arr[j] > pivot);

            if(i>=j)
                return j;
            swap(arr,i,j);
        }
   }

   // lomuto partition

    static int lPartition(int arr[],int l ,int h){
        int pivot = arr[h];
        int i = l - 1;

        for(int j = l;j <= h-1;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i +1;
    }

    private static void swap(int arr[],int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){

        int arr [] = {4,2,5,8,1,6,0};
        quickSort(arr,0,arr.length-1);

        for(int a : arr){
            System.out.print(a+",");
        }
    }
}
