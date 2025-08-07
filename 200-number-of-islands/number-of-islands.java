class Pair
{
    int l;
    int r;
    Pair(int _l,int _r)
    {
        this.l=_l;
        this.r=_r;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int[][] vis=new int[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(vis[i][j]==0 && grid[i][j]=='1')
                {
                    bfs(i,j,vis,grid);
                    count++;
                }
            }
        }

        return count;


    }

    public void bfs(int r,int c,int[][]vis,char[][] grid)
    {
        int[] del_row={-1,+1,0,0};
        int[] del_col={0,0,+1,-1};
        int a=grid.length;
        int b=grid[0].length;
        vis[r][c]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(r,c));
        while(!q.isEmpty())
        {
            int row=q.peek().l;
            int col=q.peek().r;
            q.poll();

            for(int n=0;n<4;n++)
            {
                int e_row=row+del_row[n];
                int e_col=col+del_col[n];
                if(e_row>=0 && e_row<a && e_col>=0 && e_col<b
                && grid[e_row][e_col]=='1' && vis[e_row][e_col]==0)
                {
                    vis[e_row][e_col]=1;
                    q.add(new Pair(e_row,e_col));
                }
            }
            
        }
    }





}