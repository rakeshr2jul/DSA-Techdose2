package dsa.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetter {


    static String removeDuplicate(String str){

        if(str.length()==0 && str.isEmpty())
            return "";

        Set<Character> set = new LinkedHashSet<>();

        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : set){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String args[]){

        System.out.println(removeDuplicate("dabbac"));

    }
}
