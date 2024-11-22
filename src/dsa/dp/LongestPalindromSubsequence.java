package dsa.dp;

public class LongestPalindromSubsequence {

     public static int longestPalindromSubseq(String s){

        // String text1 = s;
         String text2 = new StringBuilder(s).reverse().toString();

         int dp[][] = new int[s.length()+1][text2.length()+1];

         for(int i=1;i<dp.length;i++){
             for(int j=1; j<dp[0].length;j++){
                 if(s.charAt(i-1)==text2.charAt(j-1)){
                     dp[i][j]= dp[i-1][j-1]+1;
                 }else {
                     dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                 }
             }
         }
         return dp[s.length()][text2.length()];
     }

    public static void main (String args[]){

        System.out.println(longestPalindromSubseq("geeksforgeeks"));
    }
}
