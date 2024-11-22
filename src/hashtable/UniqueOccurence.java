package hashtable;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurence {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap();
         for (int a: arr)
            hm.put(a,hm.getOrDefault(a,0)+1);

        HashSet<Integer> hs = new HashSet<Integer>(hm.values());
        return  hs.size() == hm.size();
    }


    public static void main(String args[]){

        int arr [] ={3,5,-2,-3,-6,-6};

        System.out.println(uniqueOccurrences(arr));

    }
}
