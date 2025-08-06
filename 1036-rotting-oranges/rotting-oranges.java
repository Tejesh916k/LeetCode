class Pair
{
    int row;
    int col;
    int time;
    Pair(int _row,int _col,int _time)
    {
        this.row=_row;
        this.col=_col;
        this.time=_time;
    }
}

class Solution {
    
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();

        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        int count_ones=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else
                {
                    vis[i][j]=0;
                }
                if(grid[i][j]==1)
                {
                    count_ones++;
                }
                

            }
        }
        int [] d_rows={0,0,-1,+1};
        int [] d_cols={-1,+1,0,0};
        int cnt=0;
        int tm=0;
        while(!q.isEmpty())
        {
            int row=q.peek().row;
            int col=q.peek().col;
            int time=q.peek().time;
            tm=Math.max(tm,time);
            q.poll();
            for(int i=0;i<4;i++)
            {
                int r=row+d_rows[i];
                int c=col+d_cols[i];
                if(r<m && r>=0 && c<n && c>=0 && vis[r][c]==0 && grid[r][c]==1)
                {
                    q.offer(new Pair(r,c,time+1));
                    vis[r][c]=2;
                    cnt++;
                }
            }
        }
        if(cnt==count_ones)
        {
            return tm;
        }
        return -1;
        
    }
}