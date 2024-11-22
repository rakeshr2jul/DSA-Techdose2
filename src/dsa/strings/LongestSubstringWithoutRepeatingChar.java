package dsa.strings;

import java.util.HashSet;
//3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingChar {

    public static int lengthOfLongestSubstring(String s) {
        int res=0;
        HashSet<Character> set = new HashSet<>();
        int l =0;
        for(int r=0;r<s.length();r++){
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res,r-l+1);
        }
        return res;
    }
    public static void main(String args[]){
       // leetcode 3
        System.out.println(lengthOfLongestSubstring("abcdabcbbd"));
    }
}
