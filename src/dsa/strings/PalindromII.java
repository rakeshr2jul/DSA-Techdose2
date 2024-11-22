package dsa.strings;

public class PalindromII {

    //LT 680 "abcab" "abc"

    public static boolean validPalindrom(String s){
       int st =0;
       int end = s.length()-1;
       while (st<end){
           if(s.charAt(st) == s.charAt(end)){
               st++;
               end--;
           }else {
            return isValid(s,st+1,end)|| isValid(s,st,end-1);
           }
       }
        return true;
    }

    private static  boolean isValid(String str, int st,int end){

        while (st < end){
            if(str.charAt(st)==str.charAt(end)) {
                //return false;
                st++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){

       System.out.println(validPalindrom("aba"));
    }
}
