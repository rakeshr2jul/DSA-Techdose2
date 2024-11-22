package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class   GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
          Map<String ,List<String >> results = new HashMap<>();

          for(String str : strs){
              char ch[] = new char[26];
              for(char c : str.toCharArray()) {
                  ch[c - 'a']++;
              }
              String key = String.valueOf(ch);
              if(!results.containsKey(key)){
                  results.put(key, new ArrayList<>());
              }
              results.get(key).add(str);
          }
        return new ArrayList<>(results.values());
    }

    public static void main(String args[]){
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
       // String strs[] ={""};

       List<List<String>>  list = groupAnagrams(strs);

       System.out.println(list.toString());
    }
}
