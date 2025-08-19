class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum=0;
        long n=0;
        for(int i:nums)
        {
            if(i!=0)
            {
                sum+=n*(n+1)/2;
                n=0;
            }
            else
            {
                n++;
            }
        }
        sum+=n*(n+1)/2;
        return sum;
    }
}