package dsa.strings;

import java.util.Locale;

public class Palindrom {

    // LT 125
    static boolean isPalindrom(String str){
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        int st = 0;
        int end = str.length()-1;
        while (st < end){
            if(str.charAt(st) !=str.charAt(end))
                return false;
            st++;
            end --;
        }
        return true;
    }

    public static void main(String args[]){

       System.out.println(isPalindrom("A man, a plan, a canal: Panama"));
       System.out.println(isPalindrom("racecar"));
    }
}
