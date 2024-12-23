package dsa.sorting;

public class KthSmallestElement {

   static int kthSmallest(int arr[],int n ,int k){
      int l = 0;
      int h = n -1;

      while (l <= h){
          int p = partition(arr,l,h);
          if (p == k-1)
              return p;
          else if (p > k-1)
              h = p -1;
          else
              l = p +1;
      }
     return  -1;
   }

   static int partition(int arr[],int l ,int h){
      int pivot = arr[h];
      int i = l - 1;

      for(int j = l;j <= h-1;j++){
          if(arr[j] < pivot){
              i++;
              /*int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;*/
              swap(arr,i,j);
          }
      }
      /*int temp = arr[i+1];
      arr[i+1] = arr[h];
      arr[h] = temp;*/
       swap(arr,i+1,h);
      return i +1;
  }

    private static void swap(int arr[],int i,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]){

        int arr[] = new int[]{10,4,5,8,11,6,26};

        int n = arr.length;int k=5;
        int index=kthSmallest(arr,n,k);
        System.out.println(arr[index]);
    }
}
