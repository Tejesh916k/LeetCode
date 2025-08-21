class Solution {
    public int numSubmat(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    mat[i][j]+=mat[i][j-1];
                }
            }
        }
        int total=0;
        int width=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++ )
            {
                width=mat[j][i];
                for(int k=j;k>=0;k--)
                {
                    width=Math.min(width,mat[k][i]);
                    total+=width;
                }
            }
        }
        return total;
    }
}