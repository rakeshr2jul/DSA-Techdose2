package dsa.Hashing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyHash {

    int bucket ;
    
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b){
        bucket=b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++)
            table.add(new LinkedList<>());
   }

   void insert(int key){

        int i = key % bucket;
        table.get(i).add(key);
   }

   boolean search(int key){
        int i = key % bucket;
        return table.get(i).contains(key);
   }

   void remove(int key){
       int i = key % bucket;
       table.get(i).remove((Integer) i);
   }

   long size(){
       long count = table.stream().filter(e -> !e.isEmpty()).count();
       return count;
   }


       public static void main(String[] args)
       {
           MyHash mh = new MyHash(7);
           mh.insert(10);
           mh.insert(20);
           mh.insert(15);
           mh.insert(7);
           System.out.println(mh.search(10));
           mh.remove(15);
           System.out.println(mh.search(15));
           System.out.println(mh.size());
       }
}
