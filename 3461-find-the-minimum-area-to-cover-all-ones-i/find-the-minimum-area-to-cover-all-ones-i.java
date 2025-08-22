class Solution {
    public int minimumArea(int[][] grid) {
        int sr=-1;
        int sc=-1;
        int er=-1;
        int ec=-1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    if(sr==-1) sr=i;
                    if(sc==-1) 
                    {
                        sc=j;
                    }
                    else
                    {
                        sc=Math.min(j,sc);
                    }
                    er=Math.max(er,i);
                    ec=Math.max(ec,j);
                }
            }
        }
        int len=er-sr+1;
        int br=ec-sc+1;
        return len*br;
    }
}