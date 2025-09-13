class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+2);
        dp[0] = 0;
        System.out.println(Arrays.toString(dp));
        for(int i=0; i<coins.length; i++) {
            for(int j=1; j<amount+1; j++) {
                if (j-coins[i]>=0) {
                    dp[j] = Math.min(dp[j], dp[j-coins[i]]+1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount] != amount +2 ? dp[amount] : -1;
    }
}