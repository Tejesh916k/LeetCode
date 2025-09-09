class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        
        calculate(0,0,target,nums) ;
        return count;
    }
    public void calculate(int ind,int currSum,int k,int[]nums)
    {
        if(ind==nums.length)
        {
            if(currSum==k)
            {
                count++;
            }
            return;
        }
       
       calculate(ind+1,currSum+nums[ind],k,nums);
       calculate(ind+1,currSum-nums[ind],k,nums);
    }
}