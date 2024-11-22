package hashtable;


import java.util.HashMap;
import java.util.Map;

public class LRUCache {

     class Node {
         int val;
         int key;
         Node pre;
         Node next;

         Node(int key,int value){
             this.key = key;
             this.val = value;
         }
     }
    int capacity;
    Map<Integer, Node> cacheMap = new HashMap<>() ;
  //  Node head,tail;
    Node head , tail;
    public LRUCache(int capacity) {
            this.capacity = capacity;
            head = new Node(-1,-1);
            tail = new Node(-1,-1);
            head.next = tail;
            tail.pre = head;
    }

    public int get(int key) {

        if(!cacheMap.containsKey(key))
            return -1;

        Node node= cacheMap.get(key);
        evictKey(node);
        moveFront(node);
        return node.val;

    }
    private void evictKey(Node node){
      cacheMap.remove(node.key);
      node.pre.next = node.next;
      node.next.pre = node.pre;
    }

    private void moveFront(Node node){
     cacheMap.put(node.key,node);
     Node headNext = head.next;
     head.next = node;
     node.pre = head;
     headNext.pre = node;
     node.next = headNext;

   }


    public void put(int key, int value) {
 //   System.out.println("cache size ::"+ cacheMap.size());
        //
        if(cacheMap.containsKey(key)){
         evictKey(cacheMap.get(key));
        }
        if(cacheMap.size()==capacity) {
         evictKey(tail.pre);
        }
        moveFront(new Node(key,value));
     }



    public static void main(String args[]){
      LRUCache cache = new LRUCache(2);

      cache.put(1,10);
      cache.put(2,20);
      System.out.println("Value for the key: 2 is " + cache.get(2));
      System.out.println("Value for the key: 2 is " + cache.get(2));
      cache.put(3,30);
      System.out.println("Value for the key: 2 is " + cache.get(2));

      System.out.println("Value for the key: 3 is " + cache.get(3));
      cache.put(4,40);
      System.out.println("Value for the key: 1 is " + cache.get(1));

        System.out.println("Value for the key: 2 is " + cache.get(2));
        System.out.println("Value for the key: 4 is " + cache.get(4));
    }
}
