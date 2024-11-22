package dsa.hashmap;

import java.util.*;

public class FirstNonRepeatingChar {

    /**
     * leetcode :387 https://www.youtube.com/watch?v=ReUGo6fZafc
     * Given a string s, find the first non-repeating character in it and return its index.
     * If it does not exist, return -1.
     * @param s
     * @return
     * Input: s = "leetcode"
     * Output: 0
     *
     * Input: s = "aabb"
     * Output: -1
     */

    public static int firstUniqueChar(String s){

        if(s==null || s.length()==0) return -1;
        int charCount [] = new int[26];

        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i)-'a']++;
        }

        for(int i=0;i< s.length();i++){
            if(charCount[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;

    }



    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.get(ch)==1)
                return i;
        }

       return -1;
    }

    public static void main(String args[]){

        System.out.println(firstUniqueChar("loveleetcode"));
    }
}
