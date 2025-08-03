class Solution {
    int sum_1=0;
    public int subsetXORSum(int[] nums) {
        
        int[] dp=new int[1];
        subset(nums,0,nums.length,0,dp);
        return dp[0];
    }
    public void subset(int[] nums,int ind,int n,int curr,int[] dp)
    {
        if(ind>=n)
        {
           dp[0]+=curr;
           return; 
        }
        subset(nums,ind+1,n,curr^nums[ind],dp);
        subset(nums,ind+1,n,curr,dp);
    }
}