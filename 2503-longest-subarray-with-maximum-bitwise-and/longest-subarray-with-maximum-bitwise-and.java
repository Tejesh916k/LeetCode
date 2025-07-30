class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int max_count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>maxi)
            {
                maxi=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maxi)
            {
                count++;
            }
            else
            {
                count=0;
            }
            max_count=Math.max(count,max_count);
        }
        
        return max_count;
    }
}