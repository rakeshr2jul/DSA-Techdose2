package dsa.dp;

import java.util.Arrays;

public class CoinChange {
    // LT 322 medium https://www.youtube.com/watch?v=H9bfqozjoqs

// https://www.youtube.com/watch?v=J0C_FDmYwpg
    static int minCoin1(int coins[],int amount){
        int dp[] = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int coin :coins){
            for(int i=coin;i<=amount;i++){
                 dp[i] = Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount] <= amount ? dp[amount]: -1;
    }



    public static void main(String args[]){

        int amount=11;
        int coins [] ={1,2,5};

        System.out.println("coins :"+minCoin1(coins,amount));

    }
}
