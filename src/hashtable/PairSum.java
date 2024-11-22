package hashtable;

import java.util.HashSet;

public class PairSum {

    static boolean isPair(int arr[],int sum){

        HashSet<Integer> hashset = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            if (hashset.contains(sum - arr[i]))
                return true;
            else
                hashset.add(arr[i]);
        }
        return false;
    }

    public static void main(String args[]){

     int arr[] = {11,5,6};
     int sum = 11;

      System.out.println(isPair(arr,sum));


    }
}
