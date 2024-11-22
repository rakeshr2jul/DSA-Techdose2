package dsa.sorting;

import java.util.Arrays;

public class MinmumDifferenceInArray {

    static int getMinDifference(int arr[]){

        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for(int i=1; i<arr.length;i++){
           res = Math.min(res,arr[i]-arr[i-1]);

        }
        return res;
    }


    public static void main(String args[]){

        int arr[] = new int[]{10,8,6,26};

      System.out.println(getMinDifference(arr));

    }
}
