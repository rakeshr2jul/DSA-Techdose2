package dsa.sorting;

public class CycleSort {

    public static void distinctCycleSort(int arr[],int n){

        for(int cs=0;cs<n-1;cs++){
            int item = arr[cs];
            int pos = cs ;
              for(int i=cs+1;i<n;i++) {
                  if (arr[i] < item)
                      pos++;
              }

              int temp =item;
              item = arr[pos];
              arr[pos] = temp;
              while (pos!=cs){
                 pos = cs;

                 for(int i =cs+1;i<n;i++)
                     if(arr[i] < item)
                         pos++;

                  temp =item;
                  item = arr[pos];
                  arr[pos] = temp;
              }

        }
        
    }

    public static void main(String args[]){

        int arr[] = { 20,40,10,50,10,30 };
        int n = arr.length;
        distinctCycleSort(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+",");


    }
}
