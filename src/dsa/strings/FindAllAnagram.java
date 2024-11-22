package dsa.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagram {
    //LT :438 Medium. Find All Anagrams in a String
     static List<Integer> findAnagrams(String s,String p){
        List<Integer> result = new ArrayList<>();
        int fre [] = new int[26];
        int match =0;
        for(int i =0;i < p.length();i++){
            fre[p.charAt(i)-'a']++;
        }

        for(int i =0;i<s.length();i++){
            int current = s.charAt(i)-'a';
            fre[current]--;
            while (fre[current] < 0){
                fre[s.charAt(match++) -'a']++;
            }
            if((i-match+1) ==p.length())
                result.add(match);
        }

     return result;
    }

//https://www.youtube.com/watch?v=px9WEf0Lpjc
    static List<Integer> findAnagrams1(String so,String pat){
        List<Integer> result = new ArrayList<>();
        int pHash [] = new int[26];   int sHash [] = new int[26];
        int s = so.length();  int p = pat.length();

        for(int i =0;i < p;i++){
            pHash[pat.charAt(i)-'a']++;
            sHash[so.charAt(i)-'a']++;
        }
       /* for(int i =0;i < p;i++){

        }*/
        for(int i=p;i<s;i++){
            if(Arrays.equals(pHash,sHash)){
                result.add(i-p);
            }
            sHash[so.charAt(i)-'a']++;
            sHash[so.charAt(i-p)-'a']--;
        }
        if(Arrays.equals(pHash,sHash)){
            result.add(s-p);
        }
        return result;
    }

    public static void main(String args[]){

        //List<Integer> l = findAnagrams("cbaebabacd","abc");
        List<Integer> m = findAnagrams1("aaaaaaaaaa","aaaaaaaaaaaaa");
       System.out.println("=="+m);

    }

}
