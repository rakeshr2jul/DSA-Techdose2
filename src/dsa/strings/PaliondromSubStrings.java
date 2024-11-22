package dsa.strings;

//647. Palindromic Substrings
public class PaliondromSubStrings {
    // static int res=0;
    public static int countSubstrings(String s) {
       int res=0;
         for(int i =0;i< s.length();i++) {
            // count odd length
            res += countPalindrom(s,i,i);
            // count even length
            res += countPalindrom(s,i,i+1);
            // return res;
        }
         return res;
    }

    static int countPalindrom(String s, int left,int right){
        int res =0;
        if(s==null || left > right)
            return 0;
        while (left >=0 && right<s.length() && s.charAt(left--) == s.charAt(right++)) {
            res += 1;
        //    left --;
          //  right ++;
        }
        return res;
    }




    public static void main(String args[]){

        System.out.println(countSubstrings("cbbd"));

    }


}
