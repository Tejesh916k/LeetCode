class Solution {
    public int maxProduct(int[] nums) {
        long ans=(long)nums[0];
        long maxi=(long)nums[0];
        long mini=(long)nums[0];
        for(int i=1;i<nums.length;i++)
        {
            long temp=maxi;
            
            maxi=(long)Math.max(nums[i],Math.max(maxi*nums[i],mini*nums[i]));
            mini=(long)Math.min(nums[i],Math.min(temp*nums[i],mini*nums[i]));
            ans=Math.max(maxi,ans);
            
        }
        return (int)ans;
    }
}