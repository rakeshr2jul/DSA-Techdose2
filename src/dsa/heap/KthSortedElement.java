package dsa.heap;

import java.util.PriorityQueue;

public class KthSortedElement {
     /* Kth Sorted array means it some what sorted elements for ex
        [9,7,8,18,19,17] if k =2 then [7,8,9,17,18,19]

        nive approch directly used sort function it's time complexity nlogn

      */

    static void sortK(int arr[],int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i =0;i<=k ;i++){
            queue.add(arr[i]);
        }
        int index=0;
        for (int i =k+1;i<arr.length;i++){
            arr[index++] =queue.poll();
            queue.add(arr[i]);
        }
       while (!queue.isEmpty()){
           arr[index++] = queue.poll();
       }
    }

    public static void main(String args[]){


        int arr [] = {9,7,8,18,19,17};
        int k = 2;

        sortK(arr,k);
        for(int i : arr){
            System.out.print(i+" ");
        }


    }
}
