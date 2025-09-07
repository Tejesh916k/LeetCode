class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        int i=0;
        for(int j=1;j<=n/2;j++)
        {
            res[i++]=+j;
            res[i++]=-j;
        }
        if(n%2 !=0)res[i]=0;
        return res;
    }
}