package dsa.dp;

public class LongestCommonSubsequence {
// LT 1143 : https://www.youtube.com/watch?v=YL3b3F7sJBM
    public static int longestCommonSub(String text1,String text2){
           int dp[][] = new int[text1.length()+1][text2.length()+1];
           for(int i=0;i< dp.length;i++){
               for(int j=0; j< dp[0].length;j++){
                   dp[i][j]= -1;
               }
           }

            return recursive(text1,text2,0,0,dp);

    }

    private static int recursive(String text1,String text2,int i ,int j,int dp[][]){

        if(i >text1.length()-1 || j > text2.length()-1)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)) {
            dp[i][j]= 1 + recursive(text1, text2, i+1, j+1,dp);
            return dp[i][j];
        }
        else{
          dp[i][j]= Math.max(recursive(text1,text2,i,j+1,dp),recursive(text1,text2,i+1,j,dp));
          return dp[i][j];
        }

    }

    public static int longestCommonSubWithBottomup(String text1,String text2){
         /*
                  0   1     2   3   4   5
        i        []   a   b   c   d   e
        j  0  []  0   0   0   0   0   0
           1  a   0   1   1   1   1   1
           2  d   0   1   1   1   2   2
           3  e   0   1   1   1   2   3
            */
        int dp[][]= new int[text1.length()+1][text2.length()+1];
          for(int i=1;i< dp.length;i++){
              for(int j=1;j<dp[0].length;j++){
                  if(text1.charAt(i-1)==text2.charAt(j-1)){
                      dp[i][j]= dp[i-1][j-1]+1;
                  }else{
                      dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                  }

              }
          }
          return dp[text1.length()][text2.length()];
    }
    public static void main(String args[]){
     //  System.out.println(longestCommonSub("abcde","ade"));
        System.out.println(longestCommonSubWithBottomup("abcde","ade"));

    }
}
