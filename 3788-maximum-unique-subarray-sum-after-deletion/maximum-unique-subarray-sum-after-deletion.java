class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set_1 = new HashSet<>();
        int maxi =0; 
        int max_neg=Integer.MIN_VALUE;
        for(int i:nums)
        {
            if(i>0)
            {
                set_1.add(i);
            }
            else
            {
               max_neg= Math.max(max_neg,i);
            }
        }
        for(int i:set_1)
        {
            maxi+=i;
        }
        if(set_1.size()==0)
        {
            return max_neg;
        }
        return maxi;

    }
}