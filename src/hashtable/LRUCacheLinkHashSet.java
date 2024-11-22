package hashtable;

import java.util.LinkedHashSet;

public class LRUCacheLinkHashSet {

    static int capacity =5;

    static LinkedHashSet<String> cache = new LinkedHashSet<String>(capacity);

    public static String arrayChallenge(String[] strArr) {


        for(int i =0;i<strArr.length;i++) {
            get_Value(strArr[i]);

        }

        StringBuilder sb = new StringBuilder();
        int cacheLen = cache.toArray().length;
        System.out.println(cache.toArray().length);
        for(int i =0;i<cacheLen;i++) {
            if(i!=cacheLen-1) {
                sb.append(cache.toArray()[i]+"-");
            }else {
                sb.append(cache.toArray()[i]);
            }
        }

        return sb.toString();
    }

    public static void put(String key)
    {

        if (cache.size() == capacity) {
            String firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }

        cache.add(key);
    }


    public static boolean get(String key)
    {
        if (!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }
    public static void get_Value(String key)
    {
        if (get(key) == false)
            put(key);
    }

    public static void main(String args[]) {

        String arr[] =  {"A","B","C","D","A","E","D","Z"};

        //String arr[] =  {"A","B","A","C","A","B"};
        System.out.println(arrayChallenge(arr));

    }
}
