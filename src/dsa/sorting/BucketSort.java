package dsa.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void main (String[] args)
    {
        int arr[] = { 30,40,10,80,5,12,70 };
        int n = arr.length; int k=4;
        bucketSort(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");

    }

    static void bucketSort(int arr[],int n ,int k){

        int max_val = arr[0];

        for(int i =1; i<n; i++)
            max_val = Math.max(max_val,arr[i]);

        max_val++;

           ArrayList<ArrayList<Integer>> bukets = new ArrayList<>();

           for(int i =0;i<k;i++){
               bukets.add(new ArrayList<>());
           }

           for(int i=0;i<n;i++){
               int bi= (k*arr[i])/max_val;
               bukets.get(bi).add(arr[i]);
           }

           for (int i=0;i<k;i++){
               Collections.sort(bukets.get(i));
           }

           int index =0;
           for(int i =0;i<k;i++){
               for (int j =0; j< bukets.get(i).size();j++)
                   arr[index++] = bukets.get(i).get(j);
           }
    }
}
