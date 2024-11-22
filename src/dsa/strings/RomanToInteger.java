package dsa.strings;

import java.util.HashMap;

public class RomanToInteger {
   // Leetcode 13

    public static int romanToInt(String s) {

        int sum=0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
//"MCMXCIV"
        for(int i =0;i < s.length() ;i++){
            if(i+1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
               sum -= map.get(s.charAt(i));
             else
                sum += map.get(s.charAt(i));
        }
        return sum;

    }
    public static void  main(String args[]){

      System.out.println(  romanToInt("VII"));

    }
}
