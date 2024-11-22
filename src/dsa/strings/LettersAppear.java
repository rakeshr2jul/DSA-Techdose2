package dsa.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LettersAppear {
    /*
Given an input list of strings, for each letter appearing anywhere
in the list, find the other letter(s) that appear in the most
number of words with that letter.

Example:
['abc', 'bcd', 'cde'] =>
  {
	a: [b, c],	# b appears in 1 word with a, c appears in 1 word with a
	b: [c], 	# c appears in 2 words with b, a and d each appear in only 1 word with b
	c: [b, d], 	# b appears in 2 words with c, d appears in 2 words with c. But a and e each
					  appear in only 1 word with c.
	d: [c],		# c appears in 2 words with d. But b and e each appear in only 1 word with d
	e: [c, d], 	# c appears in 1 word with e, d appears in 1 word with e

  }
*/
    public static Map<Character, List<Character>> mostLetters(String[] arr) {
        Map<Character, Map<Character, Integer>> map = new HashMap<>();
        for (String str : arr) {
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                map.putIfAbsent(c, new HashMap<>());
                for(int j = 0; j < str.length(); j++) {
                    if(j == i) continue;
                    char c2 = str.charAt(j);
                    map.get(c).put(c2, map.get(c).getOrDefault(c2, 0) + 1);
                }
            }
        }
        Map<Character, List<Character>> result = new HashMap<>();
        for(Character c : map.keySet()) {
            result.putIfAbsent(c, new ArrayList<>());
            result.get(c).addAll(getMostChars(map.get(c)));
        }
        return result;
    }
    private static List<Character> getMostChars(Map<Character, Integer> map) {
        int max = Integer.MIN_VALUE;
        List<Character> result = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();
                result.clear();
                result.add(entry.getKey());
            } else if(max == entry.getValue()) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String args[]){
        String str[] ={"abc", "bcd", "cde"};
        Map<Character, List<Character>> hm =  mostLetters(str);

        for(Map.Entry<Character, List<Character> > entry : hm.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
    }
}
