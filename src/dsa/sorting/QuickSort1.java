package dsa.sorting;

import java.util.Arrays;
import java.util.List;

public class QuickSort1 {

    static void sort(List<Integer> list,int low,int high){

        if(low < high){
            int p = partition(list,low,high);
            sort(list,low,p);
            sort(list,p+1,high);
        }

    }
    static int partition(List<Integer> list,int low,int high){
        int pivot = list.get(low);

        int i = low-1;
        int j = high;
       while (true) {
           do {
                i++;
           }while (list.get(i) < pivot);

           do{
               j--;
           }while (list.get(j) > pivot);

           if(i >=j)
               return j;
           swap(list,i,j);
       }
    }
    static void swap(List<Integer> list,int i,int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String args[]){

        List<Integer> list = Arrays.asList(20,17,8,16,15,10);

        sort(list,0,list.size());

        for(Integer i : list){
            System.out.print(" "+i);
        }

    }
}
