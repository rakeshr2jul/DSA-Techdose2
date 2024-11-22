package dsa.strings;

public class ValidateStringWithSubSequence {

    static boolean isSubSeq(String str,String sb){

        int j =0;
        int i =0;

        while (i< str.length() && j < sb.length()){
            if(str.charAt(i) == str.charAt(j)) {
                i++;
            }
           j++;
        }
        return j==str.length();

    }
    public static void main(String args[]){

     System.out.println(isSubSeq("abcde","aed"));
    }
}
