package dsa.dp;

public class CoinChangeII {
  // LT 518 medium https://www.youtube.com/watch?v=Mjy4hd2xgrs
    public static int change(int amount, int[] coins) {
        int n = coins.length;
        if(n==0 || amount==0)
            return 0;
         int dp [] = new int[amount+1];
         dp[0]=1;

       for(int coin :coins){
            for(int i=coin;i<=amount;i++){
                dp[i] += dp[i-coin];
            }
       }

        return dp[amount];

    }

    public static void main(String args[]){
       int amount = 0;
        int coins[] = {7};

        System.out.println(change(amount,coins));


    }
}
