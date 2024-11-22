package dsa.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurence {
     // 1207. Unique Number of Occurrences
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap();
         for (int a: arr)
            hm.put(a,hm.getOrDefault(a,0)+1);

        HashSet<Integer> hs = new HashSet<Integer>(hm.values());
        return  hs.size() == hm.size();
    }


    public static void main(String args[]){

       // int arr [] ={1,2,2,1,1,3};
        int arr[] ={1,2};
        System.out.println(uniqueOccurrences(arr));

    }
}
