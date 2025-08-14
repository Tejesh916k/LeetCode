
class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0 || i==n-1 || j==0 || j==m-1) && grid[i][j]==1)
                {
                    dfs(i,j,vis,grid);
                }
            }
        }

        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==1)
                {
                    count++;
                }
            }
        }
        
        return count;

    }
    public void dfs(int row,int col,int[][] vis,int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        int[] d_row={0,0,+1,-1};
        int[] d_col={+1,-1,0,0};
        vis[row][col]=1;
        for(int i=0;i<4;i++)
        {
            int e_row=row+d_row[i];
            int e_col=col+d_col[i];
            if(e_row<n && e_col<m && e_row>=0 && e_col>=0 && 
            vis[e_row][e_col]==0 && grid[e_row][e_col]==1)
            {
                dfs(e_row,e_col,vis,grid);
            }
        }
    }
}