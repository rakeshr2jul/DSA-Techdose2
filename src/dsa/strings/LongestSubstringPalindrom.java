package dsa.strings;


//5. Longest Palindromic Substring https://www.youtube.com/watch?v=LgG2Km9GvJw
//https://www.youtube.com/watch?v=QfZvw8_jz1w
public class LongestSubstringPalindrom {

    static String longestPalindrom(String s){
        if(s==null || s.length() < 1)
            return "";
        int start =0;
        int end =0;
        for(int i=0;i<s.length();i++){
            //odd length
            int odd = expandFromMiddle(s,i,i);
            //even length
            int even  = expandFromMiddle(s,i,i+1);
            int len = Math.max(odd,even);
            if(len > end - start){
                start = i - (len-1)/2;
                end = i+ len/2;
            }
        }
      return s.substring(start,end+1);
    }

    private static int  expandFromMiddle(String s,int left ,int right){
       if(s==null || left > right)
           return 0;

        while (left >=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String args[]){
            System.out.println(longestPalindrom("cbbd"));
    }
}
