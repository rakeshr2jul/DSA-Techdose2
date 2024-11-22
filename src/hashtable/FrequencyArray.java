package hashtable;

import java.util.HashMap;
import java.util.Map;

public class FrequencyArray {

    static void frequncy(int arr[]){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int a : arr)
            hashMap.put(a,hashMap.getOrDefault(a,0)+1);

        for (Map.Entry<Integer,Integer> e :hashMap.entrySet()){
            System.out.println(e.getKey()+"=="+e.getValue());
        }
    }

    public static void main(String args[]){

        int arr [] ={-3,5,-2,-3,-6,-6};

        frequncy(arr);

    }
}
