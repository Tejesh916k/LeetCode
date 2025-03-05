class Solution {
    public long coloredCells(int n) {
        int i=0;
        if(n==1) 
        {
            return 1;
        }
        long ans=1;
        while(i<n)
        {
            ans=ans+(4*i);
            i++;
        }
        return ans;
    }
}