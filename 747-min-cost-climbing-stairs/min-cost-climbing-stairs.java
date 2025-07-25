class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];

        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=cost.length;i++)
        {
            int f=dp[i-1]+cost[i-1];
            int l=dp[i-2]+cost[i-2];

            dp[i]=Math.min(f,l);
        }
        return dp[cost.length];
    }
}