package dsa.strings;

public class Anagram {
    // 242. Valid Anagram easy
    static boolean isAnagram(String s, String t){
        int charset = 26 ;
        if(s.length() != t.length())
            return false;
        int count[] = new int[charset];
        for(int i=0;i<s.length();i++ ){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i =0;i<charset;i++){
            if(count[i] !=0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){

        System.out.println(isAnagram("eat","tae"));

    }
}
