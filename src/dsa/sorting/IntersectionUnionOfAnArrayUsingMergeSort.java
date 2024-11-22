package dsa.sorting;

public class IntersectionUnionOfAnArrayUsingMergeSort {


    static void intersection(int a[],int  b[],int m,int n){

        int i=0;
        int j =0;

        while (i < m && j < n ){
            if(i > 0 && a[i-1] == a[i]){
                i++;
                continue;
            }
           if(a[i] < b[j]) {
               i++;
           }else if (a[i] > b[j]) {
               j++;
           }else {
               System.out.print(a[i] + ",");
               i++;
               j++;
           }
        }

    }

    static void union(int a[],int b[],int m,int n){
        int i=0,j =0;
        while (i<m && j < n) {
            if(i > 0 && a[i-1] == a[i]){
                i++;
                continue;
            }
            if(j > 0 && b[j-1] == b[j]){
                j++;
                continue;
            }
            if(a[i] < b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else if (a[i] > b [j]){
                System.out.print(b[j]+" ");
                j++;
            }else {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }

        }
        while (i < m){
            if (i > 0 && a[i-1] !=a[i]){
                System.out.print(a[i]+" ");
                i++;
            }
        }
        while (j < n){
            if (j > 0 && b[j-1] !=b[j]){
                System.out.print(b[j]+" ");
                j++;
            }
        }

    }

    public static void main(String args[]){

        int a [] = {3,5,8};
        int b [] ={2,8,9,10,15};

       // int a[] = new int[]{3,5,10,10,10,15,15,20};
       // int b[] = new int[]{5,10,10,15,30};
       // intersection(a,b,a.length,b.length);
        union(a,b,a.length,b.length);
    }
}
