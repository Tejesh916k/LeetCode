class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int count=0;
        int i=1;
        while(i<n-1)
        {
            int j=i;
            int prev=nums[i-1];
            while(j+1<n && nums[j]==nums[j+1])
            {
                j++;
            }
            if(j<n-1){
            int next=nums[j+1];
            if(nums[j]>next && nums[j]>prev)
            {
                count++;
            }
            else if(nums[j]<next && nums[j]<prev)
            {
                count++;
            }
        }
        i=j+1;
        }
        return count;
    }
}