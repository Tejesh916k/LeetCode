class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] res=new int[k][k];
        int max_len=0;

        for(int i:nums)
        {
            int curr=i%k;
            for(int j=0;j<k;j++)
            {
                res[j][curr]=res[curr][j]+1;
                max_len=Math.max(max_len,res[j][curr]);

            }
        }

        return max_len;
    }
}