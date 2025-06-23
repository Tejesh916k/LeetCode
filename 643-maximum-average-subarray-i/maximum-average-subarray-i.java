class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum_1=0;

        for(int i=0;i<k;i++)
        {
            sum_1+=nums[i];
        }
        double max_sum=sum_1;
        for(int i=k;i<nums.length;i++)
        {
            sum_1=sum_1-nums[i-k]+nums[i];
            max_sum=Math.max(sum_1,max_sum);
        }

        return max_sum/k;


    }
}