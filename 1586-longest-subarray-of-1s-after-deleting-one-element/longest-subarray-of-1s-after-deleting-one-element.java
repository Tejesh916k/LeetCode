class Solution {
    public int longestSubarray(int[] nums) {
        int z_count=0;
        int l=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                z_count++;
            }
            while(z_count>1)
            {
                if(nums[l]==0) z_count--;
                l++;
            }
            
            count=Math.max(count,i-l+1);
        }

        return count-1;
    }
}