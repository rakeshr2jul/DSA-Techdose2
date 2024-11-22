package hashtable;

import java.util.HashMap;

public class FirstNonRepeatingChar {

    /**
     * LT 387 -easy
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
        /*
            Optional<Character> result = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (result.isPresent()) {
            System.out.println("First unique character: " + result.get());
        } else {
            System.out.println("No unique character found!");
        }

         */
       return -1;
    }

    public static void main(String args[]){

        System.out.println(firstUniqChar("loveleetcode"));
    }
}
