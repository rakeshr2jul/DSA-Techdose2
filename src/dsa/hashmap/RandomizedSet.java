package dsa.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
// LC380 Insert Delete GetRandom O(1)

    Map<Integer,Integer> mapIndex;
    ArrayList<Integer> list;
    public RandomizedSet(){
        mapIndex = new HashMap<>();
        list = new ArrayList<>();

    }

    public boolean insert(int val) {

        if(mapIndex.containsKey(val))
            return false;

        list.add(val);
        mapIndex.put(val, list.size()-1);
        return true;

    }

    public boolean remove(int val) {

        if(!mapIndex.containsKey(val))
            return false;

        int idx = mapIndex.get(val);
        //move
        int lastVal = list.get(list.size()-1);
        list.set(idx,lastVal);
        mapIndex.put(lastVal,idx);

        list.remove(list.size()-1);
        mapIndex.remove(val);
       return true;
    }

    public int getRandom() {

        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);

    }


    public static void main(String args[]){

        RandomizedSet rm = new RandomizedSet();
        rm.insert(1);
        rm.insert(2);
        rm.insert(1);
        rm.insert(3);
        rm.insert(7);
        System.out.println(rm.list);

        for(Map.Entry e : rm.mapIndex.entrySet()){
           System.out.println(e.getKey()+"====="+e.getValue());
        }
        System.out.println( rm.remove(3));
        System.out.println(rm.list);
      //  System.out.println( rm.remove(8));
        //System.out.println(rm.getRandom());


    }
}
