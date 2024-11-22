package dsa.strings;

public class AnagramSearch {

    static final int CHAR=26;
// efficient solutions
    static boolean anagramSearch(String text,String pat){
        int ct [] = new int[CHAR];
        int cp [] = new int[CHAR];
        for(int i =0;i<pat.length();i++){
            ct[text.charAt(i)-'a']++;
            cp[pat.charAt(i) -'a']++;
        }
        for(int i=pat.length();i<text.length();i++){
            if(areSame(ct,cp)) {
                return true;
            }
            ct[text.charAt(i)-'a']++;
            ct[text.charAt(i-pat.length())-'a']--;
        }
        return false;
    }

    static boolean areSame(int ct[],int cp[]){
        for(int i=0;i<CHAR;i++){
            if(ct[i] != cp[i])
                return false;
        }
      return true;
    }

//==============efficient solution end===========================

//=======================nive solu==================================
    static boolean isAnagram(String s, String t,int i ){
        int count[] = new int[CHAR];
        for(int j=0;j<t.length();j++ ){
            count[t.charAt(j)]++;
            count[s.charAt(i+j)]--;
        }
        for(int j =0;j<CHAR;j++){
            if(count[j] !=0)
                return false;
        }
        return true;
    }

    static boolean isPresent(String str, String pat){
        int n = str.length();
        int m = pat.length();

        for(int i =0;i<=n-m;i++){
            if(isAnagram(str,pat,i))
                return true;
        }
        return false;
    }

    public static void main(String args[]){

        String str = "geeksforgeeks";
        String pat = "keeg";
       // System.out.println(isPresent(str,pat));
        System.out.println(anagramSearch(str,pat));

    }

}
