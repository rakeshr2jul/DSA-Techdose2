package dsa.sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {

    //navie solution
    static void merge(int a[],int b[]){

        int c[] = new int[a.length+b.length];

        for (int i =0;i<a.length;i++){
            c[i] = a[i];
        }
        for (int i=0;i<b.length;i++){
            c[a.length+i] = b[i];
        }
        Arrays.sort(c);

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+",");
        }

    }

    static void merge1(int a[],int b[]){
        int i=0;
        int j=0;
        int m = a.length;
        int n = b.length;
        while (i< m && j< n){
           if(a[i]<=b[j]){
               System.out.println(a[i]);
               i++;
           }else {
               System.out.println(b[j]);
               j++;
           }

        }
      while (i<m){
          System.out.println(a[i]);
          i++;
      }
      while (j<n){
          System.out.println(b[j]);
          j++;
      }
    }


    public static void main(String args[]){

        int a[] ={10,15,20,20};
        int b[] = {2,5,7};
        merge1(a,b);

    }
}
