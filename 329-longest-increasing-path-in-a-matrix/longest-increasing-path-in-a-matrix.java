class Solution {
    int[][] matrix;
    int n;
    int m;
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        this.n=matrix.length;
        this.m=matrix[0].length;
        this.matrix=matrix;
        this.dp=new int[n][m];
        int maxi=0;
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            maxi= Math.max(maxi,dfs(i,j,-1));
        }
       }
       return maxi;
    }
    public int dfs(int r,int c,int prev)
    {
        if(r<0 || r>=n || c<0 || c>=m || matrix[r][c]<=prev)
        {
            return 0;
        }

        if(dp[r][c]!=0)
        {
            return dp[r][c];
        }

        int res=1;
        res=Math.max(res,1+dfs(r+1,c,matrix[r][c]));
        res=Math.max(res,1+dfs(r-1,c,matrix[r][c]));
        res=Math.max(res,1+dfs(r,c+1,matrix[r][c]));
        res=Math.max(res,1+dfs(r,c-1,matrix[r][c]));

        dp[r][c]=res;
        return dp[r][c];

    }
}